/*
 * John Claessens
 * The purpose of this program is to Create a class named MyRectangle to represent rectangles. The required data fields are width, height, and color. Use double data type for width and height, and a String for color.
 * 22 Oct 2016
 * Bellevue University
 * Assignment 9.3
 * Some of the code in this program may be similiar to code found in Introduction to Java Programming by Y. Daniel Liang
 */

public class MyRectangle{

	  private double width = 1.0;
	  private double height = 1.0;
	  private static String color = "white";

	  public MyRectangle(){ 
	  }

	  public MyRectangle(double widthParam, double heightParam, String colorParam){ 
		width = widthParam;
		height = heightParam;
		this.color = colorParam;
	  }

	  public double getWidth(){ 
		return width;
	  }

	  public void setWidth(double widthParam){ 
		this.width =  widthParam;
	  }

	  public double getHeight(){ 
		return height;
	  }

	  public void setHeight(double heightParam){ 
		this.height =  heightParam;
	  }

	  public String getColor(){ 
		return color;
	  }  

	  public static void setColor(String colorParam){ 
		color = colorParam;
	  }

	  public double findArea(){ 
		return width * height;
	  }

}