/*
 * John Claessens
 * The purpose of this program is to Create a class named MyRectangle to represent rectangles. The required data fields are width, height, and color. Use double data type for width and height, and a String for color.
 * 22 Oct 2016
 * Bellevue University
 * Assignment 9.3
 * Some of the code in this program may be similiar to code found in Introduction to Java Programming by Y. Daniel Liang
 */
 
public class Assignment_9_3{
	
	public static void main(String [] args){
		//Declaring my first rectangle
		MyRectangle rectangle1  = new MyRectangle(2.5,5.5,"red");
		//Displaying my first rectangle
		System.out.println("\n My first rectangle is:\n  Width  - " + rectangle1.getWidth() + "\n  Height - " + rectangle1.getHeight() + "\n  Color  - " + rectangle1.getColor() + "\n  Area   - " + rectangle1.findArea());
		//Declaring my second rectangle
		MyRectangle rectangle2 = new MyRectangle(3.0,9.0,"yellow");
		//Displaying my second rectangle
		System.out.println("\n My second rectangle is:\n  Width  - " + rectangle2.getWidth() + "\n  Height - " + rectangle2.getHeight() + "\n  Color  - " + rectangle2.getColor() + "\n  Area   - " + rectangle2.findArea());
		
	}//End of Main
}//End of Assignment_9_3


