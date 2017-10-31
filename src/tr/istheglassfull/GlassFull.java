/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istheglassfull;

import java.util.Random;

/**
 *
 * @author volt
 */
public class GlassFull {
    
    static String determined;
    static String verbose;
    
    static String randVerbose() {
        
        Random rand = new Random();
        
        int random_number = rand.nextInt(100);
        if(random_number == 100) {
            verbose = "full" + " (" + random_number + ")";
        } else if(random_number <= 99 && random_number >= 90){
            verbose = "almost full" + " (" + random_number + ")";
        } 
        else if(random_number <= 60 && random_number >= 25){
            verbose = "half full" + " (" + random_number + ")";
        } else if(random_number < 30 && random_number >= 0){
            verbose = "barely full" + " (" + random_number + ")";
        } else{
            verbose ="pretty much empty" + " (" + random_number + ")";
        }
        
        return verbose;
    }
    
    public static void main(String[] args) {
        
        determined = randVerbose();
        System.out.println(determined);
    }
    
}
