/*
 * John Claessens
 * The purpose of this program is to write a Java application that reads three integer inputs into variables. Display the input values in both the ordered entered and in sorted order. This program should sort the numbers so that value1 <= value2 <= value3.
 * 9 Sept 2016
 * Bellevue University
 * Assignment 3.3
 * Some of the code in this program may be similiar to code found in Chapter 3 of Introduction to Java Programming by Y. Daniel Liang
 */
 
import java.util.*;

public class threeInts {
	
	public static void main(String [] args){

	//Input 3 integer values
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 unique Interger values: "); //Prompt user to input 3 integers
		int userInt1 = input.nextInt( ); //capture the users first input
		int userInt2 = input.nextInt( ); //capture the users second input
		int userInt3 = input.nextInt( ); //capture the users third input	
		
	//Display integers in sorted order lowest to highest value1 <= value2 <= value3
		int value1 = 0;
		int value2 = 0;
		int value3 = 0;
	//Assign userInt1 to a value		
		if (userInt1 >= userInt2 &&  userInt1 >= userInt3)
			value3 = userInt1;		
		else if (userInt1 <= userInt2 &&  userInt1 >= userInt3 || userInt1 <= userInt3 &&  userInt1 >= userInt2)
			value2 = userInt1;
		else if (userInt1 <= userInt2 &&  userInt1 <= userInt3)
			value1 = userInt1;
	//Assign userInt2 to a value		
		if (userInt2 <= userInt1 &&  userInt2 <= userInt3)
			value1 = userInt2;		
		else if (userInt2 >= userInt1 &&  userInt2 >= userInt3)
			value3 = userInt2;
		else if (userInt2 <= userInt1 &&  userInt2 >= userInt3 || userInt2 <= userInt3 &&  userInt2 >= userInt1)
			value2 = userInt2; 
	//Assign userInt3 to a value		
		if (userInt3 <= userInt2 &&  userInt3 >= userInt1 || userInt3 <= userInt1 &&  userInt3 >= userInt2)
			value2 = userInt3;		
		else if (userInt3 >= userInt2 &&  userInt3 >= userInt1)
			value3 = userInt3;
		else if (userInt3 <= userInt2 &&  userInt3 <= userInt1)
			value1 = userInt3;
		
	//Display integers in the order they were entered
		System.out.println("Order Entered: " + userInt1 + "    " + userInt2 + "    " + userInt3);
	//Display integers sorted so that value1 <= value2 <= value3.
		System.out.println("Order  Sorted: " + value1 + " <= " + value2 + " <= " + value3);
		
	}	

}