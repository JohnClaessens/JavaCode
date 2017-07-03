//  John Claessens
//  Assignment 3.1
//  Lottery Game Application
//  Bellevue University
//  03 July 2017

import java.util.Random;
import java.util.Scanner;

public class LotteryGame{
    
    public static void main(String [] args){
        
        //declare variables to hold user selected values
        int intChoice1,intChoice2,intChoice3,intChoice4;
        int intNumRight = 0;
        
        //Create scanner
        Scanner sc = new Scanner(System.in);
        
        //clear the screen
        CLS();
        
        // Get user input  
        System.out.println("\n\n  Pick 4 lotter numbers between 0 and 9\n");
        System.out.print("  Choose a Lottery Number > ");
        intChoice1 = sc.nextInt(); 
        System.out.print("  Choose a Lottery Number > ");
        intChoice2 = sc.nextInt(); 
        System.out.print("  Choose a Lottery Number > ");
        intChoice3 = sc.nextInt(); 
        System.out.print("  Choose a Lottery Number > ");
        intChoice4 = sc.nextInt(); 
        
        //clear the screen
        CLS();
        
        //array to hold lottery numbers
        int [] intLotteryNumbers = new int[4];        
        
        //fill lottery number array
        Random rand = new Random();
        for(int x = 0; x < intLotteryNumbers.length; x++){
            intLotteryNumbers[x] = rand.nextInt(9);
            for (int y = 0; y < x; y++){
                if(intLotteryNumbers[x] == intLotteryNumbers[y]){
                    x--;
                    break;
                }              
            }//if statement checks if duplicate value and resets the outer loop      
            
        }
        System.out.println("\n\n  The winning Numbers are >\n");
        for(int z = 0;z < intLotteryNumbers.length;z++ ){
            System.out.println("\t" + intLotteryNumbers[z]);
        }
        
        for(int a = 0;a < intLotteryNumbers.length;a++ ){
            if(intChoice1 == intLotteryNumbers[a]){
                intNumRight+=1;
            }
            else if(intChoice2 == intLotteryNumbers[a]){
                intNumRight+=1;
            }
            else if(intChoice3 == intLotteryNumbers[a]){
                intNumRight+=1;
            }
            else if(intChoice4 == intLotteryNumbers[a]){
                intNumRight+=1;
            }
        }
        System.out.println("\n\n  The numbers you chose are " + intChoice1 + ", " + intChoice2 + ", " +  intChoice3 + ", " + intChoice4 + "\n");
        
        switch(intNumRight){
            case 0: //No matches	0 points
                System.out.println("  Sorry you didn't get any numbers right 0 points");
                break;
            case 1://Any one digit matching	5 points
                System.out.println("  You got 1 number right and earned 5 points");
                break;
            case 2://Any two digits matching	100 points
                System.out.println("  You got 2 number right and earned 100 points");
                break;
            case 3://Any three digits matching	2,000 points
                System.out.println("  You got 3 number right and earned 2,000 points");
                break;
            case 4://All four digits matching	1,000,000 points
                System.out.println("  You got all numbers right and earned 1,000,000 points");
                break;
        }
        
    }//End of main method
    
    public static void CLS(){
        //Method to clear the console
        for(int x = 0;x<30;x++){
            System.out.println("\n");
        }
    }
   
    
}//End of LotteryGame class