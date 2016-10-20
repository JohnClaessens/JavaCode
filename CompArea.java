/*
 * John Claessens
 * 26 Aug 2016
 * Assignment 1.3
 * The purpose of this program is to Write a Java application that outputs all of the following on a separate line:
 */
 import java.util.Scanner;
public class CompArea {
	
	//Main
    public static void main(String[] args) {
		//variables
		double radius;
		double area;
		
		//Read in radius
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		radius = input.nextDouble();
		//radius = 20;
		//compute area
		area = radius * radius * 3.14159;
		//display results
        System.out.println("The Area of a circle whose radius is " + radius + " equals: " + area);
    }    
}
