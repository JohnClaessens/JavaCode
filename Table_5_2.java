/*
 * John Claessens
 * The purpose of this program is to write a Java application that prints the following table using the sqrt ( ) method in the Math class.
 * 25 Sept 2016
 * Bellevue University
 * Assignment 5.2
 * Some of the code in this program may be similiar to code found in Introduction to Java Programming by Y. Daniel Liang
 */

public class Table_5_2 {
	
	public static void main(String [] args){
		
		System.out.println("\nNumber  SquareRoot");
		for(int i = 0; i <= 20; i+=2){
			System.out.printf("%-5d %8.4f",i , Math.sqrt(i));
			System.out.println();
			}//End for loop
	}//End main
}//End table_5_2