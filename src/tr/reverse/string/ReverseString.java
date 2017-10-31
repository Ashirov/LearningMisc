/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.reverse.string;

/**
 *
 * @author volt
 */
public class ReverseString {

    static char[] str_array; // The char array for the original given string from 'str'
    static char[] str_array_reversed; // The array for the reversed string from 'str_array'
    
    static String str_final; // The FINAL string of the string reversed
    
    static String reversal(String str){

        int str_length = str.length(); // integer of the imported string's length
        
        str_array = new char[str_length]; // allocate memory for a new array for the non-reversed string that is the length of the imported string
        str_array_reversed = new char[str_length]; // allocate memory for a new array for the reversed string that is the length of the imported string
        
        for(int a = 0; a <= (str_length - 1); a++){
            
            char current_selection_a = str.charAt(a); // create char that tracks each character inside of 'str' String
            str_array[a] = current_selection_a; // set each selected character to the progressively increasing position given via for loop

        }
        
        int c = (str.length() - 1); // create the 'c' integer used for determining the position of str_array starting at the end
        
        for(int b = 0; b <= (str_length - 1); b++){
            
            char current_selection_b = str_array[c]; // create char that tracks each character inside of the 'str_array' char array.
            str_array_reversed[b] = current_selection_b; // set each selected character to the progressively increasing position via the for loop
            
            c--; // negate the 'c' integer every time for loop runs, so that the character extracted from the 'str_array' char array is lowered until the beginning character
            
        }
        
        str_final = new String(str_array_reversed); // set the 'str_final' string to a String identical to the 'str_array_reversed' char array
        
        return str_final; // return the final str_final String
    }

    public static void main(String[] args){
        
        reversal("potato"); //call the 'reversal()' method, with the string to be reversed as the argument
        System.out.println("The reversed string: " + str_final); // print out the final reversed string called with the return 'str_final' String variable
        
        
        /*
        // DEBUG MISC
        System.out.println(str_array[0]);
        System.out.println(str_array[1]);
        System.out.println(str_array[2]);
        System.out.println(str_array[3]);
        System.out.println(str_array);
        System.out.println(str_array_reversed[0]);
        System.out.println(str_array_reversed[1]);
        System.out.println(str_array_reversed[2]);
        System.out.println(str_array_reversed[3]);
        */
        
    }
}
