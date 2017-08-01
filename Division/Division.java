//  John Claessens
//  Assignment 7.1
//  Division Abstract Class
//  Bellevue University
//  31 July 2017
//
//  Create an abstract Division class with fields for a company's division name and account number, and an abstract display() method that will be defined in the subclasses.  Use a constructor in the superclass that requires values for both fields.

public abstract class Division{
    //Declare variables
    public String strDivisionName;
    public String strAccountNumber;
    
    //Display Method
    public abstract void display();
    
    //Default Division Constructor
    public Division(){
        strDivisionName = "";
        strAccountNumber= "";
    }//End default constructor
    
    public Division(String dName, String aNum){
        strDivisionName = dName;
        strAccountNumber = aNum;
    }
    
    //Getters and Setters
    public void setDivisionName(String dName){
        strDivisionName = dName;
    }

    public String getDivisionName(){
        return strDivisionName;
    }

    public void setAccountNumber(String aNum){
        strAccountNumber = aNum;
    }

    public String getAccountNumber(){
        return strAccountNumber;
    }
    
}//End Division abstract Class