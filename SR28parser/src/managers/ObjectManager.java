/*
 * Singleton manager - contains references to all objects, for purposes of ID lookups
 * All objects should register with it upon construction
 * Any duplicate IDs will overwrite the old reference
 */
package managers;

import java.util.HashMap;
import java.util.Objects;
import uk.ac.tees.cis2003.marshmallow.objects.*;

/**
 * @author s6115598
 */
public class ObjectManager
{
    private static ObjectManager singleton;
    
    private HashMap<Integer, Food> foodMap; 
    private HashMap<Integer, FoodGroup> foodGroupMap; 
    private HashMap<String, NutrientDatum> nutrientDatumMap; 
    private HashMap<Integer, NutrientDef> nutrientDefMap; 
    private HashMap<String, Weight> weightMap; 
    
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
        
    }
}

class KeyPair<A, B>
{
    A a;
    B b;
    
    public KeyPair(A a, B b)
    {
       this.a = a;
       this.b = b;
    }

    @Override
    public boolean equals(Object obj)
    {
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