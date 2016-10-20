/*
 * John Claessens
 * The purpose of this program is to write overloaded Java methods (four different methods) that return the difference of two parameters. Your methods should contain the logic to return the difference of the larger parameter – smaller parameter, regardless of parameter order.
 * 1 October 2016
 * Bellevue University
 * Assignment 6.2
 * Some of the code in this program may be similiar to code found in Introduction to Java Programming by Y. Daniel Liang
 */
import java.util.*;

public class Overloaded{
	
public static int num3 = 0; //Class level variable to be used in all methods
public static double num4 = 0.0;//Class level variable to be used in all methods

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Scanner enables user input
		
		System.out.print("Please enter two integers: ");		
		System.out.println(diff(input.nextInt(),input.nextInt()));
		System.out.print("Please enter two doubles: ");
		System.out.println(diff(input.nextDouble(),input.nextDouble()));
		System.out.print("Please enter one integer and one double: ");
		System.out.println(diff(input.nextInt(),input.nextDouble()));
		System.out.print("Please enter one double and one integer: ");
		System.out.println(diff(input.nextDouble(),input.nextInt()));
	}
	
	public static int diff(int num1, int num2){	//overload method for a integer first then integer second	
		if (num1 > num2){
		num3 = num1 - num2;
		return num3;
		}
		else{
		num3 = num2 - num1;	
		return num3;
		}
	}
	public static double diff(double num1, double num2){//overload method for a double first then double second
		if (num1 > num2){
		num4 = num1 - num2;
		return num4;
		}
		else{
		num4 = num2 - num1;
		return num4;
		}
	}
	public static double diff(int num1, double num2){//overload method for a integer first then double second
		if (num1 > num2){
		num4 = num1 - num2;
		return num4;
		}
		else{
		num4 = num2 - num1;
		return num4;
		}
	}
	public static double diff(double num1, int num2){ //overload method for a double first then integer second
		if (num1 > num2){
		num4 = num1 - num2;
		return num4;
		}
		else{
		num4 = num2 - num1;
		return num4;
		}
	}
}