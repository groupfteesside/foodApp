/*
 * Singleton manager - contains references to all objects, for purposes of ID lookups
 * All objects should register with it upon construction
 * Any duplicate IDs will overwrite the old reference
 */
package managers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import uk.ac.tees.cis2003.marshmallow.objects.*;

public class ObjectManager
{
    private static ObjectManager singleton;
    
    private HashMap<Integer, Food> foodMap; 
    private HashMap<Integer, FoodGroup> foodGroupMap; 
    private HashMap<CompoundKeyPair<Integer, Integer>, NutrientDatum> nutrientDatumMap; 
    private HashMap<Integer, NutrientDef> nutrientDefMap;
    private HashMap<CompoundKeyPair<Integer, Integer>, Weight> weightMap; 
    
    private ObjectManager()
    {
        singleton = this;
        
        foodMap = new HashMap<>();
        foodGroupMap = new HashMap<>();
        nutrientDatumMap = new HashMap<>();
        nutrientDefMap = new HashMap<>();
        weightMap = new HashMap<>();
    }

    public static ObjectManager getObjectManager()
    {
        if (singleton != null) return singleton;
        else return new ObjectManager();
    }
    
    public void registerFood(Food food)
    {
        foodMap.put(food.getId(), food);
    }
    
    public void registerFoodGroup(FoodGroup fg)
    {
        foodGroupMap.put(fg.getId(), fg);
    }
    
    public void registerNutrientDatum(NutrientDatum nut)
    {
        int foodId = nut.getFood().getId();
        int nutId = nut.getNutrient().getId();
        CompoundKeyPair<Integer, Integer> kp = new CompoundKeyPair<>(foodId, nutId);
        nutrientDatumMap.put(kp, nut);
    }
    
    public void registerNutrientDef(NutrientDef nut)
    {
        nutrientDefMap.put(nut.getId(), nut);
    }
    
    public void registerWeight(Weight wt)
    {
        int foodId = wt.getFood().getId();
        int seq = wt.getSeq();
        CompoundKeyPair<Integer, Integer> kp = new CompoundKeyPair<>(foodId, seq);
        weightMap.put(kp, wt);
    }

    public Food getFoodById(int id)
    {
        return foodMap.get(id);
    }
    
    public FoodGroup getFoodGroupById(int id)
    {
        return foodGroupMap.get(id);
    }
    
    public NutrientDatum[] getNutrientDataByFoodId(int id)
    {
        ArrayList<NutrientDatum> returnArray = new ArrayList<>();
        nutrientDatumMap.forEach((k, v) -> 
        {
            if (k.getA() == id)
            {
                returnArray.add(v);
            }
        });
        
        return (NutrientDatum[]) returnArray.toArray();
    }
    
    /**
    * Constructs a new Food object from a line of FOOD_DES.txt and registers it
    * @return Food The created object
    */
    public Food newFoodFromLine(String inLine)
    {
        Food food = new Food(inLine);
        getObjectManager().registerFood(food);
        return food;
    }

    public FoodGroup newFoodGroupFromLine(String inLine)
    {
        FoodGroup fg = new FoodGroup(inLine);
        getObjectManager().registerFoodGroup(fg);
        return fg;
    }
    
    public NutrientDatum newNutrientDatumFromLine(String inLine)
    {
        NutrientDatum nut = new NutrientDatum(inLine);
        getObjectManager().registerNutrientDatum(nut);
        return nut;
    }
    
    public NutrientDef newNutrientDefFromLine(String inLine)
    {
        NutrientDef nut = new NutrientDef(inLine);
        getObjectManager().registerNutrientDef(nut);
        return nut;
    }
    
    public Weight newWeightFromLine(String inLine)
    {
        Weight wt = new Weight(inLine);
        getObjectManager().registerWeight(wt);
        return wt;
    }
}

class CompoundKeyPair<A, B>
{
    A a;
    B b;
    
    public CompoundKeyPair(A a, B b)
    {
       this.a = a;
       this.b = b;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null) return false; 
        if (obj.getClass() != CompoundKeyPair.class) return false;
        return (obj.hashCode() == this.hashCode());
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.a);
        hash = 37 * hash + Objects.hashCode(this.b);
        return hash;
    }
}