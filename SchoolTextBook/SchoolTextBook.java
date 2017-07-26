//  John Claessens
//  Assignment 5.1
//  SchoolTextBook
//  Bellevue University
//  16 July 2017
/*  Create a class titled SchoolTextBook that contains fields for the author, title, page count, ISBN, and price. This SchoolTextBook class will also provide setter and getter methods for all fields. Save this class in a file titled SchoolTextBook.java.
*/
//import java.util.Comparator;  -- this path may have been right, but I didn't know enough on how to do it

public class SchoolTextBook{  
    
    //Declare Variables
    private String strAuthor, strTitle, strISBN;
    private int intPageCount; 
    private double dblPrice;
    
    //Constructor
    public SchoolTextBook(String author, String title, String ISBN, int pageCount, double price){
        this.strAuthor = author;
        this.strTitle = title;
        this.strISBN = ISBN;
        this.intPageCount = pageCount;
        this.dblPrice = price;
    }
    
    public SchoolTextBook(){
        
    }
    
    //getters and setters
    public String getAuthor(){
        return strAuthor;
    }
    
    public void setAuthor(String author){
        this.strAuthor = author;
    }
    
    public String getTitle(){
        return strTitle;
    }
    
    public void setTitle(String title){
        this.strTitle = title;
    }
    
    public String getISBN(){
        return strISBN;
    }
    
    public void setISBN(String ISBN){
        this.strISBN = ISBN;
    }
    
    public int getPageCount(){
        return intPageCount;
    }
    
    public void setPageCount(int pageCount){
        this.intPageCount = pageCount;
    }
    
    public double getPrice(){
        return dblPrice;
    }
    
    public void setPrice(double price){
        this.dblPrice = price;
    }
   
}//end of SchoolTextBook class