//  John Claessens
//  Assignment 2.1
//  Bellevue University
//  24 June 2017

import javax.swing.*;
import java.lang.*;


public class Exponent{
        public static void main(String [] args){
            //declaring variables
            String userInput;
            double numToCalculate;
            double numCalculated;            
            
            //get user to enter a double value
            userInput = JOptionPane.showInputDialog(null, "Please enter a number to calclate:"); 
            //convert the string input to a double
            numToCalculate = Double.parseDouble(userInput);
            
            //to access the non-static method create an instance of Exponent
            Exponent e = new Exponent();    
            
            //assign a value to the numCalculated by passing a value to the squareValue method
            numCalculated = e.squareValue(numToCalculate);
            
            //display the output in a dialog box
            JOptionPane.showMessageDialog(null,"The number " + numToCalculate + " squared is " + numCalculated);
            
            //assign a value to the numCalculated by passing a value to the squareValue method
            numCalculated = e.cubeValue(numToCalculate);
            
            //display the output in a dialog box
            JOptionPane.showMessageDialog(null,"The number " + numToCalculate + " cubed is " + numCalculated);
            
            //exit the program
            System.exit(0);
        }//End of Main 
        
        public double squareValue(double param1){
            //take the value passed into the method and calculate the square value and return
            param1 = Math.pow(param1,2);
            return param1;     
        }//End of squareValue
        
        public double cubeValue(double param1){
            //take the value passed into the method and calculate cube value and return
            param1 = Math.pow(param1,3);
            return param1;     
        }//End of squareValue
        
}//End of Exponent class