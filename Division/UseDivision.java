//  John Claessens
//  Assignment 7.1
//  UseDivision Class
//  Bellevue University
//  31 July 2017
//
//  Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).  

public class UseDivision{
 
    public static void main(String[] args){
        
        //International Division Instances
        InternationalDivision IntDiv1 = new InternationalDivision("VM-Japan", "1cJ345", "Japan", "Japanese");
        InternationalDivision IntDiv2 = new InternationalDivision("VM-Ireland", "1aI678", "Ireland", "Gaelic");
        
        //Displaying the International Divisions
        IntDiv1.display();
        IntDiv2.display();
        
        //Domestic Division Instances
        DomesticDivision DomDiv1 = new DomesticDivision("VM-California", "1bCal42", "California");        
        DomesticDivision DomDiv2 = new DomesticDivision("VM-Nebraska", "1dNeb16", "Nebraska"); 
        
        //Displaying the Domestic Divisions
        DomDiv1.display();
        DomDiv2.display();

    }//End of Main
    
}//End of UseDivision Class