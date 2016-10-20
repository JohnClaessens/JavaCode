/*
 * John Claessens
 * The purpose of this program is to write a Java application that checks if a user input number is even.
 * 9 Sept 2016
 * Bellevue University
 * Assignment 3.2
 * Some of the code in this program may be similiar to code found in Chapter 3 of Introduction to Java Programming by Y. Daniel Liang
 */
 
import java.util.*;

public class evenTest {
	
	public static void main(String [] args){

//Input a number
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a Number: "); //Prompt user to input a number
		int userNum = input.nextInt( ); //capture the users input
		
//Check if number is even
		boolean isEven;
		if (userNum % 2 == 0)
			isEven = true;
		else
			isEven = false;

//Display result
		System.out.println("Is the number " + userNum + " even? " + isEven);
	}	

}