/*
 * John Claessens
 * The purpose of this program is to Write a Java application titled MyStringTest that creates an instance of the String class and initializes this instance with a String literal. Use a for loop structure to print the string in reverse order. Implement the following two String member methods to complete the assignment.
 * 22 Oct 2016
 * Bellevue University
 * Assignment 9.4
 * Some of the code in this program may be similiar to code found in Introduction to Java Programming by Y. Daniel Liang
 */

public class MyStringTest{
	
	public static void main(String [] args){
		//Instantiating String class and initializing the string literal
		String words = new String("These are the words I have chosen");
		//Displaying the String literal before anything is done
		System.out.println(" The String literal is:\n\n    " + words + "\n");
		
		int len = words.length(); //examining the length of the string literal to assign a length to a char array
		
		char [] letters = new char[len];// Creating a char array to store the string literal
		
		//inspecting each position of the string literal and assigning it to a position in the char array and then printing each member of the char array
		System.out.println(" The String literal in reverse order is: \n");
		System.out.print("    ");
		for(int i = letters.length-1; i >= 0; i--){
			letters[i] = words.charAt(i);
			System.out.print(letters[i]);
		}
		System.out.println("\n");
	}
}