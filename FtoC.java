/*
 * John Claessens
 * The purpose of this program is to write a Java application that converts Fahrenheit to Celsius.
 * 4 Sept 2016
 * Bellevue University
 * Assignment 2.2
 * Some of the code in this program may be similiar to code found in Chapter 2 of Introduction to Java Programming by Y. Daniel Liang
 */
 import java.util.Scanner;
 
public class FtoC {
	
	//Main
    public static void main(String[] args) {
		
		//Allow for user to input a Fahrenheit temperature
			//Create Scanner object
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Fahrenheit Temperature: ");
			double fahrenheit = input.nextDouble(); //capture the users input
		
		//Calculate Fahrenheit to Celsius
			double celsius = ( 5.0 / 9.0 ) * (fahrenheit - 32.0);
		
		//Display results
			System.out.println("The Temperature: ");
			System.out.println(fahrenheit + " degrees Fahrenheit equals ");
			System.out.println(celsius + " degrees Celsius");
    }    
}
