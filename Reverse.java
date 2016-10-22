import java.util.*;

public class Reverse{
	
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any word: ");
		String word = input.nextLine();
		//input.close();
		System.out.println("You entered the word " + word);
		//CharArray(word);
		int len = word.length();
		char [] letters = new char[len];
		for(int i = letters.length-1; i >= 0; i--){
			letters[i] = word.charAt(i);
			System.out.print(letters[i]);
		}
		
	}
	//public class CharArray[](String str){
		//char [] letters = String.toCharArray(str);
		//return 
	//}
}