/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author s6115598
 */
public class SR28Helper 
{
    // Returns string with first and last characters removed
    // To help with those bloody annoying tildes
    public static String trimField(String s)
    {
        if (s.length() > 2) return s.substring(1, s.length()-1);
        else return "";
    }
    
}
