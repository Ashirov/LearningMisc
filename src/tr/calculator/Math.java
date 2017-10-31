/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author volt
 */
public class Math {
    
    String operation;
    static int x;
    static int y;
    static int answer;
    
    static int operate(String operation, int x, int y) {
        if(operation == "add") {
            answer = (x + y);
        }
        else if(operation == "subtract") {
            answer = (x - y);
        }
        else if(operation == "multiply") {
            answer = (x * y);
        }
        else if(operation == "divide") {
            answer = (x / y);
        }
        else {
        }
        return answer;
    }
    
    public static void main(String[] args) {
        
    }
}
