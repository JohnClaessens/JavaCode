//  John Claessens
//  Assignment 2.2
//  TestCollegeStudent
//  Bellevue University
//  24 June 2017

import javax.swing.*;
import java.util.*;

public class TestCollegeStudent{
    
    public static void main(String [] args){  
    
        //declare variables to get the number of students
        int numStudents = 0;
        String count= "";
        
        //sets the number of students you wish to enter
        count = JOptionPane.showInputDialog(null, "Please enter a number of students");
        numStudents = Integer.parseInt(count);
        
        //Starts loop for each student
        while (numStudents > 0){
          
        //declare fields for use in the form  
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        JTextField field4 = new JTextField();
        JTextField field5 = new JTextField();
        
        //declare variables to capture data frot he fields
        String firstName = "";
        String lastName = "";
        int enrollmentDay = 0;
        int enrollmentMonth = 0;
        int enrollmentYear = 0;
        
        //Object to use in the dialog box
        Object[] message = {
                "First Name:", field1,
                "Last  Name:", field2,
                "Enrollment Day:", field3,
                "Enrollment Month:", field4,
                "Enrollment Year:", field5,
                };
         
        //display the dialog box withthe fields and capture what button was pushed         
        int option = JOptionPane.showConfirmDialog(null, message, "Enter all information", JOptionPane.OK_CANCEL_OPTION);
        
        //check that ok was selected then assign data to the variables
        if (option == JOptionPane.OK_OPTION)
        {
            firstName = field1.getText();
            lastName = field2.getText();
            enrollmentDay = Integer.parseInt(field3.getText());                           
            enrollmentMonth = Integer.parseInt(field4.getText());
            enrollmentYear = Integer.parseInt(field5.getText());
        }
        
        //Create enrollment date instance using the parameters captured fromt he form
        GregorianCalendar enrollmentDate = new GregorianCalendar(enrollmentYear, enrollmentMonth, enrollmentDay);
                
        //create a new CollegeStudent named student
        CollegeStudent student = new CollegeStudent(firstName,lastName,enrollmentDate);        
        
        //display the information in a dialog box after the data is passed to the constructor
        JOptionPane.showMessageDialog(null,"First name: " + student.firstName + "\nLast Name: " + student.lastName + "\nEnrollment Date: " + student.enrollmentDate.get(GregorianCalendar.DAY_OF_MONTH) + "/" + student.enrollmentDate.get(GregorianCalendar.MONTH) + "/" + student.enrollmentDate.get(GregorianCalendar.YEAR) + "\nGraduation Date: " + student.projectedGradDate.get(GregorianCalendar.DAY_OF_MONTH) + "/" + student.projectedGradDate.get(GregorianCalendar.MONTH) + "/" + student.projectedGradDate.get(GregorianCalendar.YEAR));
        
        //decrement the numStudents variable for the loop
        numStudents --;
        }
        
        //exit the program
        System.exit(0);
        
    }//End of Main

}//End of TestCollegeStudent class