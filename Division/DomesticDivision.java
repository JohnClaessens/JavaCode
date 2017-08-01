//  John Claessens
//  Assignment 7.1
//  DomesticDivision subClass
//  Bellevue University
//  31 July 2017
//
//  Create two subclasses named InternationalDivision and DomesticDivision. The DomesticDivision class include a field for the state in which the division is located and a constructor that requires all fields when created.

public class DomesticDivision extends Division{
    //Declare Variables
    public String strState;
    
    //Default DomesticDivision Constructor
    public DomesticDivision(){
        super();
        strState = "";
    }//end default constructor

    public DomesticDivision(String dname, String aNum, String state){
        super(dname, aNum);
        strState = state;
    }
    
    //Getters and Setters
    public void setState(String state){
        strState = state;
    }
    
    public String getState(){
        return strState;
    }
    
    //Display Method
    public void display(){
        System.out.println("  Domestic Division");
        System.out.printf("    Division Name : %15s\n", getDivisionName());
        System.out.printf("    Division ACC #: %15s\n", getAccountNumber());
        System.out.printf("    Division State: %15s\n", getState());
        System.out.println();
    }
    
}//End DomesticDivision Class