/*
 * John Claessens
 * The purpose of this program is to write a Java application using iteration that will print two of the following patterns. Select either #1 & #4 OR #2 & #3 patterns.
 * 18 Sept 2016
 * Bellevue University
 * Assignment 4.2
 * Some of the code in this program may be similiar to code found in Introduction to Java Programming by Y. Daniel Liang
 * Some code is copied from blackboard provided by Professor Darrell Payne
 */
public class iteration {
	
	public static void main(String[] args) {
		
		System.out.println("#2");
		for (int row = 6; row >= 1; row--) {
			for (int column = 1; column <= row; column++) {
				System.out.print(column + " ");
			}
			System.out.println();
		}//end of pattern #2
		System.out.println("\n#3:");
		for(int row = 1;  row <= 6; ++row){
			for(int space = 6; space > row; --space){
				System.out.print("  "); 
			}
			for(int column = 1; column <= row; column++){
				System.out.print(column + " "); 
			}
			System.out.println();
		}
	}//End of Main
}//End of iteration class