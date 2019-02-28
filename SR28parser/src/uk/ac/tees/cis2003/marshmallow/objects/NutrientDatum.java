package uk.ac.tees.cis2003.marshmallow.objects;

import static uk.ac.tees.cis2003.marshmallow.util.SR28Helper.*;

public class NutrientDatum
{
    /*
    from NUT_DATA.txt
        food id
        nutrient def id
        value
        
    (currently) omitted fields
        number of data points
        standard error
        source code
        derivation code
        reference food id
        number of studies
        minimum value
        maximum value
        degrees of freedom
        lower error bound
        upper error bound
        statistical comments
        added/modified date
        confidence code
    */
    
    private Food food;
    private NutrientDef nutrient;
    private double value;

    public Food getFood()
    {
        return food;
    }

    public NutrientDef getNutrient()
    {
        return nutrient;
    }

    public double getValue()
    {
        return value;
    }
    
    public NutrientDatum(String inLine)
    {
        String[] splitLine = inLine.split(FIELD_DELIMITER);
        int foodId = Integer.parseInt(trimEnds(splitLine[0]));
        /*
        TODO: assign Food object from foodID
        */
        int nutrientId = Integer.parseInt(trimEnds(splitLine[1]));
        /*
        TODO: assign Nutrient object from nutrient ID
        */
        value = Double.parseDouble(splitLine[2]);
    }
}