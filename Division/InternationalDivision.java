//  John Claessens
//  Assignment 7.1
//  InternationalDivision subClass
//  Bellevue University
//  31 July 2017
//
//  Create two subclasses named InternationalDivision and DomesticDivision.  The InternationalDivision class includes a field for the country in which the division is located, a field for the language spoken, and a constructor that requires all fields when created.


public class InternationalDivision extends Division{
    //Declare Variables
    public String strCountry;
    public String strLanguage;
    
    //Default InternationalDivision Constructor
    public InternationalDivision(){
        super();
        strCountry = "";
        strLanguage = "";
    }//end default constructor

    public InternationalDivision(String dName, String aNum, String country, String language){
        super(dName, aNum);
        strCountry = country;
        strLanguage = language;
    }
    
    //Getters and Setters
    public void setCountry(String country){
        strCountry = country;
    }
    
    public String getCountry(){
        return strCountry;
    }

    public void setLanguage(String language){
        strLanguage = language;
    }

    public String getLanguage(){
        return strLanguage;
    }
    
    //Display Method
    public void display(){
        System.out.println("  International Division");
        System.out.printf("   Division  Name : %15s\n", getDivisionName());
        System.out.printf("   Division  Acc #: %15s\n", getAccountNumber());
        System.out.printf("   Divison Country: %15s\n", getCountry());
        System.out.printf("   Division  Lang : %15s\n", getLanguage());
        System.out.println();
    }
    
}//End InternationalDivision Class