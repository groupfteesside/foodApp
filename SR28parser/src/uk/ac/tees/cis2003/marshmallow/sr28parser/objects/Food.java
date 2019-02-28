package uk.ac.tees.cis2003.marshmallow.sr28parser.objects;

import static uk.ac.tees.cis2003.marshmallow.sr28parser.util.SR28Helper.*;

public class Food 
{
    /*
    from FOOD_DES.txt
        item number
        group number
        long description
        short description
        manufacturer
    
    (currently) omitted fields
        common name(s)
        survey
        refuse description
        refuse percentage
        scientific name
        N factor
        protein factor
        fat factor
        CHO factor
    */
    
    private final int id;
    private final FoodGroup group;
    private final String longDesc;
    private final String shortDesc;
    private final String manufacturer;

    public int getId() {
        return id;
    }

    public FoodGroup getGroup() {
        return group;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    
    // Construct Item via a line from FOOD_DES.txt
    public Food(String lineIn)
    {
        String[] splitLine = lineIn.split(FIELD_DELIMITER);
        id = Integer.parseInt(trimEnds(splitLine[0]));
        int groupId = Integer.parseInt(trimEnds(splitLine[1]));
        group = null;
        /*
        TODO: use groupId to find and set FoodGroup object
        */
        longDesc = trimEnds(splitLine[2]);
        shortDesc = trimEnds(splitLine[3]);
        manufacturer = trimEnds(splitLine[5]);
    }
}
