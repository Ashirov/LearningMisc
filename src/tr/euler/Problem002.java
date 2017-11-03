/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.euler;

/**
 *
 * @author volt
 */
public class Problem002 {
    
    static int x = 1; // first int
    static int y = 2; // second int
    static int sum = 2; // combined total of 'x' and 'y'
    static int evenSum = 2; // the total EVEN sum of 'x' and 'y'
    
    public static int fibonacci(){
        
        while(sum < 4000000){
            
            sum = (x + y);
            x = y;
            y = sum;
            
            if(sum % 2 == 0){
                
                evenSum = evenSum + sum;
                
            } else{}
            
        }
        
        return evenSum;
    }
    
    public static void main(String[] args){
        
        int exec = fibonacci();
        
        System.out.println(evenSum);
        
    }
    
}
