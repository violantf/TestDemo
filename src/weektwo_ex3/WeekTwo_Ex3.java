/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weektwo_ex3;

import java.util.Scanner;

/**
 *
 * @author owner
 */
public class WeekTwo_Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Distance d1 = new Distance(1,505);
        Distance d2 = new Distance(1,700);
        Distance d3 = new Distance();
        d3 = d1.add(d2);
        
        System.out.print(d3);
        
    }
    
    public static String pigLatinaffy(String s) {
        
        String[] sarr = s.split(" ");
        String newString = "";
        
        for(String arr : sarr) {
            String newStr = arr.substring(1) + arr.charAt(0) + "ay ";
            
            newString += newStr;
        }
        newString = newString.substring(0, newString.length() - 1); //removes final space
        return newString;
    }
    
}
