/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.cis2003.marshmallow.sr28parser.objects;

import static uk.ac.tees.cis2003.marshmallow.sr28parser.util.SR28Helper.*;

public class NutrientDef 
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
    public NutrientDef(String inLine)
    {
        String[] splitLine = inLine.split(FIELD_DELIMITER);
        id = Integer.parseInt(trimEnds(splitLine[0]));
        units = trimEnds(splitLine[1]);
        description = trimEnds(splitLine[3]);
    }
}
