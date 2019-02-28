package uk.ac.tees.cis2003.marshmallow.sr28parser.objects;

import static uk.ac.tees.cis2003.marshmallow.sr28parser.util.SR28Helper.trimEnds;

public class FoodGroup 
{
    private int id;
    private String description;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    
    // Construct from line of FD_GROUP.txt
    public FoodGroup(String inLine)
    {
        String[] splitLine = inLine.split("\\^");
        id = Integer.parseInt(trimEnds(splitLine[0]));
        description = trimEnds(splitLine[1]);
    }
}
