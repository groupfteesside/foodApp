/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.cis2003.marshmallow.objects;

import static uk.ac.tees.cis2003.marshmallow.util.SR28Helper.trimEnds;

/**
 *
 * @author s6115598
 */
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
