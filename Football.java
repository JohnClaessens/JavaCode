/* John Claessens
 * September 17, 2016
 * Assignment 4.1
 */
 import java.util.*;

public class football{

  public static void main(String[] args){
	  
	  int yardLine = 20;
	  int forwardProgress;
	  
	  Scanner input = new Scanner(System.in);
		System.out.println("You are now on the " + yardLine + "yard line.");
		
		while (yardLine <= 99){
			System.out.println("Call the next play, 1=pass, 2=run:");
			int userInput = input.nextInt();
				if (userInput == 1){
					forwardProgress = (int)(Math.random() * 20);
					System.out.println("Your pass play resulted in " + forwardProgress + "yards");
					yardLine = yardLine + forwardProgress;
					if (yardLine > 100){yardLine = 100;
					System.out.println("You are now on the " + yardLine + " yard line");
					}
					else{System.out.println("You are now on the " + yardLine + " yard line");}
				}
				else if(userInput == 2){
					forwardProgress = (int)(Math.random() * 10);
					System.out.println("Your running play resulted in " + forwardProgress + "yards");
					yardLine = yardLine + forwardProgress;
					if (yardLine > 100){yardLine = 100;
					System.out.println("You are now on the " + yardLine + " yard line");
					}
					else{System.out.println("You are now on the " + yardLine + " yard line");}
				}
				else{
					System.out.println("Coach called a time out!");
				}
		
		}		
			System.out.println("TOUCHDOWN!");
	
  }
}