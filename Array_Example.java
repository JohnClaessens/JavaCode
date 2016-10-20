/* John Claessens
 * The purpose of this program is to:
 * Create a Java application that implements use of an int array. 
 * Use for loops to iterate through the array using the array’s length variable to stay within the array bounds.
 * Fill the array with random numbers and print the array.
 * 8 October 2016
 * Bellevue University
 * Assignment 7.2
 * Some of the code in this program may be similiar to code found in Introduction to Java Programming by Y. Daniel Liang 
*/


public class Array_Example{
	
	public static void main (String [] args){
		
		int [] list1 = {10,19,26,45,22,18,49}; // Declaring an integer type array and assigning values
			
		System.out.println("\n\nThere are " + list1.length + " integers in the list and here they are:\n"); //Here by using the list1.length method, we are able to print to the console how many numbers are in the array
			
		for(int i=0; i<list1.length;i++){//Using a for loop that will cycle through each item in the array
				System.out.println("The integer that is at index " + (i) + " is: " + list1[i]);//Here we use the i value from the for loop as an index value of our array to print out to the console each number in the array. The first index of an array is 0
		}
	}	
}