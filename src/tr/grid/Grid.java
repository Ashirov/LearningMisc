/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.grid;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author volt
 */
public class Grid {
    
    String fileName = "grid.txt";
    String line = null;
    
    public void FileOpen(){
        
        try{
            
            FileReader fileReader = new FileReader(fileName);
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            
        } catch(FileNotFoundException ex){
            System.out.println("Unable to open file: '" + fileName + "'");
        } catch(IOException ex){
            System.out.println("Error reading file: '" + fileName + "'");
        }
        
    }    
    
    // everything is initialized and created here
    public static void main(String[] args){
        
        Grid gridder = new Grid();
        
        gridder.FileOpen();
        
    }
    
}
