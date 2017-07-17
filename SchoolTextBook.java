//  John Claessens
//  Assignment 5.1
//  SchoolTextBook
//  Bellevue University
//  16 July 2017
/*  Create a class titled SchoolTextBook that contains fields for the author, title, page count, ISBN, and price. This SchoolTextBook class will also provide setter and getter methods for all fields. Save this class in a file titled SchoolTextBook.java.
*/

import javax.swing.JOptionPane;

public class SchoolTextBook {  
    
    private String strAuthor, strTitle, strISBN;
    private int intPageCount;
    private double dblPrice;
    
    public SchoolTextBook(String author, String title, String ISBN, int pageCount, double price){
        this.strAuthor = author;
        this.strTitle = title;
        this.strISBN = ISBN;
        this.intPageCount = pageCount;
        this.dblPrice = price;
    }
    
    //getters and setters
    public String getAuthor(){
        return strAuthor;
    }
    
    public void setAuthor(String author){
        strAuthor = author;
    }
    
    public String getTitle(){
        return strTitle;
    }
    
    public void setTitle(String title){
        strTitle = title;
    }
    
    public String getISBN(){
        return strISBN;
    }
    
    public void setISBN(String ISBN){
        strISBN = ISBN;
    }
    
    public int getPageCount(){
        return intPageCount;
    }
    
    public void setPageCount(int pageCount){
        intPageCount = pageCount;
    }
    
    public double getPrice(){
        return dblPrice;
    }
    
    public void setPrice(double price){
        dblPrice = price;
    }
  
}//end of SchoolTextBook class