//  John Claessens
//  Assignment 4.1
//  Purchase
//  Bellevue University
//  08 July 2017
/*  Write an application that accepts a user's password from an input dialogs.  When the entered password is less than six characters, more than 10 characters, or does not contain at least one letter and one digit, prompt the user again.  When the user's entry meets all the password requirements, prompt the user to reenter the password, and do not let the user continue until the second password matches the first one.  Save the file as Password.java.
*/

import javax.swing.JOptionPane;

public class Password {  
    
    //Main Method
    public static void main(String [] args){
        
        //declare variables
        String strUserPass = "";
        String strVerifyPass = "";
        int intPassLength = 0;
        boolean boolContainsLetter = false;
        boolean boolContainsDigit = false;        
        
        while (intPassLength < 6 || intPassLength > 10 || boolContainsLetter == false || boolContainsDigit == false){
            strUserPass = JOptionPane.showInputDialog(null, "Please create your password.\n\nPassword Criteria\n-Minimum 6 characters\n-Maximum 10 characters\n-Include at least 1 digit\n-Include at least 1 letter\n\n"); 
            intPassLength = strUserPass.length();
            char [] passwordArray =  strUserPass.toCharArray();
            for(int x = 0; x < intPassLength; x++){
                if(Character.isLetter(passwordArray[x]) == true) {
                    boolContainsLetter = true;
                }
                else if(Character.isDigit(passwordArray[x]) == true) {
                    boolContainsDigit = true;
                }//end if block
            }//end for loop
            
        }//end while loop
        
        while(strVerifyPass.equals(strUserPass) == false){
            strVerifyPass = JOptionPane.showInputDialog(null, "Please Verify Password."); 
        }//end while loop
        
        JOptionPane.showMessageDialog(null,"Password has been accepted!");
        
        //exit the program
        System.exit(0);
           
  }//End of main method
  
}//end of Password class