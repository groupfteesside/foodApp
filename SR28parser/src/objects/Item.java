/*
 * Temporary name - I apologies
 * 
 * Represents a single item in the SR28 database, containing all data pertaining to it
 */
package objects;

import static objects.SR28Helper.trimField;

/**
 * @author 
 */
public class Item 
{
    /*
    from FOOD_DES.txt
        item number
        group number
        long description
        short description
        manufacturer
    from NUT_DATA.txt
        
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
    public Item(String lineIn)
    {
        String[] splitLine = lineIn.split("\\^");
        id = Integer.parseInt(trimField(splitLine[0]));
        int groupId = Integer.parseInt(trimField(splitLine[1]));
        group = null;
        /*
        TODO: use groupId to find and set FoodGroup object
        */
        longDesc = trimField(splitLine[2]);
        shortDesc = trimField(splitLine[3]);
        manufacturer = trimField(splitLine[5]);
    }
}
