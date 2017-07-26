//  John Claessens
//  Assignment 6.1
//  Student.java
//  Bellevue University
//  24 July 2017
/* Create a class named Student that includes String data fields titled firstName and lastName, and an integer field titled studentID. Create a constructor that requires two String parameters and one integer parameter to populate the firstName, lastName, and studentID fields. 
*/


public class Student{  
    
    //Declare Variables
    private String strFirstName, strLastName;
    private int intStudentID; 
    
    //Constructor
    public Student(String fName, String lName, int stdtID){
        this.strFirstName = fName;
        this.strLastName = lName;
        this.intStudentID = stdtID;
    }
    
    public Student(){
        
    }
    
    //getters and setters
    public String getFirstName(){
        return strFirstName;
    }
    
    public void setFirstName(String fName){
        this.strFirstName = fName;
    }
    
    public String getLastName(){
        return strLastName;
    }
    
    public void setLastName(String lName){
        this.strLastName = lName;
    }
    
    public int getStudentID(){
        return intStudentID;
    }
    
    public void setStudentID(int stdtID){
        this.intStudentID = stdtID;
    }
   
}//end of SchoolTextBook class