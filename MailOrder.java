/*  John Claessens
    Assignment 9.1
    MailOrder.java
    Bellevue University
    15 AUG 2017

    Write an application for a mail order company. The program uses a data entry screen in which the user types an item number and a quantity. Write each record to a file. Save your file as MailOrder.java.
    
    References: https://www.javatpoint.com/java-filewriter-class
                https://www.javatpoint.com/java-bufferedwriter-class
                https://www.javatpoint.com/java-filereader-class
*/

import java.io.*;
import java.util.Scanner;

public class MailOrder { 

    public static void main(String[] args) { 
        
        //Declare Variables
        Scanner input = new Scanner(System.in);       
        String delimiter = "\t\t";
        String strItemNumber = "0";
        String strQuantity;
        String strOutput;        
        
        //Create the file if it doesn't exist
        File file = new File("C:\\Temp\\MailOrder.txt");
            
            try { 
                if (!file.exists()){//create directory
                    if(file.getParentFile().mkdir()){ 
                        System.out.println("Directory is created!");
                        }
                    else{
                        //do nothing
                        }   
                    }   
                if (!file.exists()){//create the file
                   file.createNewFile();                           
                   }
            }//end of try block
            catch (Exception e) { 
                    System.out.println("Errors: " + e);
                }
        try{
        //Create File writer
        FileWriter fileWrite = new FileWriter(file,true);
        
        //create BufferWriter
        BufferedWriter buffWrite = new BufferedWriter(fileWrite);
        
        //Get input to write to the file            
        while(Integer.parseInt(strItemNumber)!=999){ 
        
            //Get the item number 
            System.out.print("Enter Item Number or 999 to exit >> ");
            strItemNumber = input.nextLine();
            
            // Check if the user wants to quit and break the loop if true
            if(Integer.parseInt(strItemNumber) == 999) break;
            
            //Get the Quantity
            System.out.print("Enter Quantity >> ");
            strQuantity = input.nextLine();
            
            //Create a string to write to the file
            strOutput = strItemNumber + delimiter + strQuantity +"\n";
            
            //Write to the file
            buffWrite.write(strOutput, 0, strOutput.length());
               
            }
        //close buffWrite  
        buffWrite.close();  
        
        }//end of try block
        catch (Exception e) { 
                    System.out.println("Errors: " + e);
                }
        try{
        FileReader fr=new FileReader("C:\\Temp\\MailOrder.txt");    
        int i;  
        System.out.println("\n  Items in the list:");
        System.out.println("\nItem #\t\tQuantity");
        while((i=fr.read())!=-1)   
            System.out.print((char)i);    
        
        fr.close();
        }
        catch (Exception e) { 
                    System.out.println("Errors: " + e);
                }
        
    } //END of Main
    
 } //End of MailOrder
