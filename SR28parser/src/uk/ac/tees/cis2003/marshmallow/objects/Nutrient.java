/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.cis2003.marshmallow.objects;

import static uk.ac.tees.cis2003.marshmallow.util.SR28Helper.*;

/**
 *
 * @author s6115598
 */
public class Nutrient 
{
    /*
    from NUTR_DEF.txt
        id number
        units
        description
    
    (currently) cmitted fields
        tagname
        decimal places
        SR order
    */
    
    private int id;
    private String units;
    private String description;

    public int getId() {
        return id;
    }

    public String getUnits() {
        return units;
    }

    public String getDescription() {
        return description;
    }
    
    // Constructs via a line from NUTR_DEF.txt
    public Nutrient(String inLine)
    {
        String[] splitLine = inLine.split(FIELD_DELIMITER);
        id = Integer.parseInt(trimEnds(splitLine[0]));
        units = trimEnds(splitLine[1]);
        description = trimEnds(splitLine[3]);
    }
}
