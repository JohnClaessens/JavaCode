/*
 * John Claessens
 * The purpose of this program is to write a Java application that finds the total and average of odd numbers from 1 to 15.  Your program must use a counted loop to accomplish this task.
 * 18 Sept 2016
 * Bellevue University
 * Assignment 4.3
 * Some of the code in this program may be similiar to code found in Chapter 3 of Introduction to Java Programming by Y. Daniel Liang
 */

public class oddNums {
	
	public static void main(String [] args){
		int oddSum = 0;
		int count = 0;
		System.out.println("\n\n The odd numbers between 1 and 15 are:");
		for(int i = 1; i <= 15; i++){
			if(i % 2 != 0){
				oddSum = oddSum + i;
				System.out.print("\n " + i);
				count++;
			}
			
		}
		System.out.println("\n\n The sum of all the odd numbers equals: " + oddSum);
		System.out.println(" The average of all the odd numbers is: " + oddSum/count);

	}	

}