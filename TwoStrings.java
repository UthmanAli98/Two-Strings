/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two.strings;

import java.util.HashSet;

/**
 *
 * @author Uthman Alibalogun
 */
public class TwoStrings {

    /**
     * @param args the command line arguments
     */
    static String twoStrings(String s1, String s2) {
    
        /**
         * Since we are looking for a common substring it just means that if at
         * least s1 & s2 contains 1 like character then it satisfies the condition
         * 
         */
    if(s1.length() == 0 || s2.length() == 0) return "NO";
    
    //keeps track of the current character
    String currentChar = "";
    
    //iterates through one of the strings and if the other contains the character the condition is satisfied
    
    for(int i = 0 ; i < s1.length(); i++){
        currentChar += s1.charAt(i);
       if(s2.contains(currentChar)) {
           return "YES";
       }
        
       currentChar = "";
    
    }
    return"NO";
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hi", "world"));
    }
    
}
