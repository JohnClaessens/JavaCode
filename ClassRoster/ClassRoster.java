//  John Claessens
//  Assignment 2.2
//  ClassRoster.java
//  Bellevue University
//  24 June 2017
/*  Create a LinkedList of 20 Student objects each having different first names, last names, and student IDs. Print your LinkedList, first in the order your items were placed onto the LinkedList and then in reverse order. Save your files as Student.java and ClassRoster.java.
*/

import java.util.*;

public class ClassRoster{
    
    public static void main(String [] args){  
        
        //Creeate my lkinked list
        LinkedList<Student> list=new LinkedList<Student>();
        
        //created an array of first names to use to populate the linked list
        String [] fnames = {"Amy","Bob","Chris","David","Elvis","Frank","Grant","Hank","Irene","Julie","Ken","Linda","Mark","Nancy","Olivia","Peter","Quinn","Randy","Sandy","Tony"};
        
        //created an array of last names to use to populate the linked list
        String [] lnames = {"St. John","Barker","Cornell","Blaine","Presley","Sinatra","Clarke","Williams","Farley","Chen","Adams","James","Locke","Drew","Parks","Pan","Smith","Duval","Beach","Stark"};

        //populate the Linked list with a loop
        for(int x = 0; x < fnames.length; x++){
           list.add(new Student(fnames[x],lnames[x],x*3+7)); 
        }
        
        //printing list forward 
        System.out.println("\n  Printing LinkedList in Order\n");
        
        //loop through the list and print to console
        for(Student stdt : list){            
            System.out.printf("    Name: %-8s %-10s ID: %-5s",stdt.getFirstName(),stdt.getLastName(),stdt.getStudentID());
            System.out.println();
        }
        
         //printing a line between lists
        System.out.println("-----------------------------------------");
                
        //reverse the order of the linked list
        Collections.reverse(list);
        
        //printing list backwards
        System.out.println("  Printing LinkedList in REVERSE Order\n");
        
        //loop through the list and print to console
        for(Student stdt : list){            
            System.out.printf("    Name: %-8s %-10s ID: %-5s",stdt.getFirstName(),stdt.getLastName(),stdt.getStudentID());
            System.out.println();
        }
        
    }//End of Main
    
    

}//End of SchoolTextBookSort class