/*
 * John Claessens
 * The purpose of this program is to write a program that implements a method that receives an array parameter and sorts that array using the bubble-sort algorithm
 * 17 October 2016
 * Bellevue University
 * Assignment 8.2
 * Some of the code in this program may be similiar to code found in Introduction to Java Programming by Y. Daniel Liang
 */
 
public class BubbleSort{

	public static void main(String[] args){
		
		int [] numbers = new int[] {32,4,6,1,17,45,2,8,55,3,27,14,5,10,25,13}; // Creating an array and assigning values
		//Display unsorted numbers array
		for(int i = 0; i < numbers.length; i++) {			
				System.out.print(numbers[i] + "   ");
			}
		System.out.println();
		sortArray(numbers);//passing the array to the sortArray Method
		
		// Display sorted numbers array
		for(int i = 0; i < numbers.length; i++) {			
				System.out.print(" " + numbers[i] + "  ");
			}
		
	}//End of Main method
	
	public static void sortArray(int [] numberArray){
		int numTempVal;//temp variable for holding array values during the swap
        boolean changed;//boolean variable will hold the false value until all array values have been placed in order
		do{
			changed = false;//initial value to keep the loop going until all array numbers have been sorted
			for(int i = 0; i < numberArray.length -1;i++){//Cycles through the array
				if(numberArray[i] > numberArray[i+1]){//checks if first index is larger than the next index
					 numTempVal = numberArray[i];//swap Numbers holds the array value in a temp variable
                           numberArray[i] = numberArray[ i+1 ]; //places the smaller number in the lowere index array position
                           numberArray[ i+1 ] = numTempVal; //places the temp variable in the larger index array position
                          changed = true;//shows a swap happened 
				}
			}
		}while(changed);//when all array values have been sorted the loop will end
	}//End of SortArray method
}//End of BubbleSort class