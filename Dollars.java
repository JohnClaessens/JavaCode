//  John Claessens
//  Assignment 1.1
//  Bellevue University
//  20 June 2017

import javax.swing.*;

public class Dollars {

  public static void main(String [] args){
      
    //userInput and intInput variable declarations 
    String userInput;
    int intInput = 0;
    int intHundred = 0;
    int intFifty = 0;
    int intTwenty = 0;
    int intTen = 0;
    int intFive = 0;
    int intOne = 0;
    
    //prompt user for input and respond
    userInput = JOptionPane.showInputDialog(null, "Please enter a dollar amount:"); 
    intInput = Integer.parseInt(userInput);
    while (intInput!= 0) {
        intHundred = intInput/100;
        intInput = intInput % 100;
        intFifty = intInput/50;
        intInput = intInput % 50;
        intTwenty = intInput/20;
        intInput = intInput % 20;
        intTen = intInput/10;
        intInput = intInput % 10;
        intFive = intInput/5;
        intInput = intInput % 5;
        intOne = intInput /1;
        intInput = intInput % 1;
    }
    JOptionPane.showMessageDialog(null,"You entered the dollar amount: $" + userInput);
    JOptionPane.showMessageDialog(null,"Currency breakdown is:\n\n" + intHundred + "    Hundreds\n" + intFifty + "    Fifties\n" + intTwenty + "    Twenties\n" + intTen + "    Tens\n" + intFive + "    Fives\n" + intOne + "    Ones\n");

    System.exit(0);
  }
}