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
            double numToSquare;
            double numSquared;            
            
            //get user to enter a double value
            userInput = JOptionPane.showInputDialog(null, "Please enter a number to square:"); 
            //convert the string input to a double
            numToSquare = Double.parseDouble(userInput);
            
            //to access the non-static method create an instance of Exponent
            Exponent e = new Exponent();    
            
            //assign a value to the numSquared by passing a value to the squareValue method
            numSquared = e.squareValue(numToSquare);
            
            //display the output in a dialog box
            JOptionPane.showMessageDialog(null,"The number " + numToSquare + " squared is " + numSquared);
            
            //exit the program
            System.exit(0);
        }//End of Main 
        
        public double squareValue(double param1){
            //take the value passed into the method and calculate the square of thsi number
            //param1 = param1 * param1;
            //this can also be done using the Math.pow method
            param1 = Math.pow(param1,2);
            return param1;     
        }//End of squareValue
        
}//End of Exponent class