//  John Claessens
//  Assignment 2.2
//  TestCollegeStudent
//  Bellevue University
//  24 June 2017

import javax.swing.*;
import java.util.*;


public class TestCollegeStudent{
    
    public static void main(String [] args){           
            
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        JTextField field4 = new JTextField();
        JTextField field5 = new JTextField();
        String firstName = "";
        String lastName = "";
        int enrollmentDay = 0;
        int enrollmentMonth = 0;
        int enrollmentYear = 0;
        
        Object[] message = {
                "First Name:", field1,
                "Last  Name:", field2,
                "Enrollment Day:", field3,
                "Enrollment Month:", field4,
                "Enrollment Year:", field5,
                };
        int option = JOptionPane.showConfirmDialog(null, message, "Enter all information", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION)
        {
            firstName = field1.getText();
            lastName = field2.getText();
            enrollmentDay = Integer.parseInt(field3.getText());                           
            enrollmentMonth = Integer.parseInt(field4.getText());
            enrollmentYear = Integer.parseInt(field5.getText());
        }
        GregorianCalendar enrollmentDate = new GregorianCalendar(enrollmentYear, enrollmentMonth, enrollmentDay);
        
        //System.out.println(firstName + " " + lastName + " " + enrollmentDay + "/" + enrollmentMonth + "/" + enrollmentYear);            
        CollegeStudent student = new CollegeStudent(firstName,lastName,enrollmentDate);  
        //student.setFirstName(firstName);
        //student.setLastName(lastName);
        //student.setEnrollmentDate(enrollmentDate);
        
        System.out.println("First name: " + student.firstName + "\nLast Name: " + student.lastName + "\nEnrollment Date: " + enrollmentDate.get(GregorianCalendar.DAY_OF_MONTH) + "/" + enrollmentDate.get(GregorianCalendar.MONTH) + "/" + enrollmentDate.get(GregorianCalendar.YEAR) + "\nGraduation Date: " + student.projectedGradDate.get(GregorianCalendar.DAY_OF_MONTH) + "/" + student.projectedGradDate.get(GregorianCalendar.MONTH) + "/" + student.projectedGradDate.get(GregorianCalendar.YEAR));
        
        //exit the program
        System.exit(0);
    }//End of Main

}//End of TestCollegeStudent class