//  John Claessens
//  Assignment 2.2
//  CollegeStudent Class file
//  Bellevue University
//  25 June 2017

import java.util.*;

public class CollegeStudent{
    
    //declaring variables
    public String firstName;
    public String lastName;
    public GregorianCalendar enrollmentDate;
    public GregorianCalendar projectedGradDate;
   
    //constructor
    public CollegeStudent(String firstName, String lastName, GregorianCalendar enrollmentDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.enrollmentDate = enrollmentDate;
        projectedGradDate = new GregorianCalendar(
                                enrollmentDate.get(enrollmentDate.YEAR),
                                enrollmentDate.get(enrollmentDate.MONTH),
                                enrollmentDate.get(enrollmentDate.DAY_OF_MONTH));
        projectedGradDate.add(enrollmentDate.YEAR,4);    
    }
    
    //getters and setters
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String firstName){
        lastName = lastName;
    }
    
    public GregorianCalendar getEnrollmentDate(){
        return enrollmentDate;
    }
    
    public void setEnrollmentDate(GregorianCalendar enrollmentDate){
        enrollmentDate = enrollmentDate;
    }
    
    
}//End of CollegeStudent class