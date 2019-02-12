/*
 * Temporary name - I apologies
 * 
 * Represents a single item in the SR28 database, containing all data pertaining to it
 */
package objects;

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
        common name
        manufacturer
    */
    
    private int id;
    private FoodGroup group;
    private String longDesc;
    private String shortDesc;
    private String manufacturer;

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
        /*
        TODO: use groupId to find and set FoodGroup object
        */
        longDesc = trimField(splitLine[2]);
        shortDesc = trimField(splitLine[3]);
        manufacturer = trimField(splitLine[5]);
    }
    
    // Returns string with first and last characters removed
    // To help with those bloody annoying tildes
    private String trimField(String s)
    {
        if (s.length() > 2) return s.substring(1, s.length()-1);
        else return "";
    }
}
