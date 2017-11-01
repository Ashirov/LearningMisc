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
public class Problem001 {
    
    static int x;
    static int y;
    static int sum = 0;
    static int answer;
    
    public static int modulo(int x, int y){
        
        for(int i = 0; i < 1000; i++){
            
            if(i % x == 0 || i % y == 0){
                
                sum = (sum + i);
                
            } else {}
            
        }
        
        return sum;
    }
    
    public static void main(String[] args){
        
        int exec = modulo(3, 5);
        
        System.out.println(sum);
        
    }
    
}
