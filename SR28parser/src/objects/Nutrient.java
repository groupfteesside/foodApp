/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import static objects.SR28Helper.trimField;

/**
 *
 * @author s6115598
 */
public class Nutrient 
{
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
        String[] splitLine = inLine.split("\\^");
        id = Integer.parseInt(trimField(splitLine[0]));
        units = trimField(splitLine[1]);
        description = trimField(splitLine[3]);
    }
}
