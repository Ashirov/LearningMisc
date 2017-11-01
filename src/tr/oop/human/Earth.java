/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.oop.human;

/**
 *
 * @author volt
 */
public class Earth {
    
    public static void main(String[] args){
        
        Human tom = new Human(); // Create new 'Human' object called "tom" ... created via constructor in 'Human.java' file
        
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Zsabo";
        
        tom.speak(); // use the 'speak()' method from 'Human.java' file
        
        System.out.println("==================");
        
        Human joe = new Human();
        
        joe.age = 25;
        joe.eyeColor = "blue";
        joe.heightInInches = 67;
        joe.name = "Joe Joey";
        
        joe.speak();
        
    }
    
}
