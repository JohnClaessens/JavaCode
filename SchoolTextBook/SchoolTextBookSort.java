//  John Claessens
//  Assignment 2.2
//  TestCollegeStudent
//  Bellevue University
//  24 June 2017
/*  Write an application with an array that holds 5 instances of the SchoolTextBook class, filled without prompting the user for input. Next prompt the used to enter a field for sorting, sort the array of objects based on the user input, and then display the newly sorted array of objects. Save this class in a file titled SchoolTextBookSort.java.
*/

import java.util.*;

public class SchoolTextBookSort{
    
    public static void main(String [] args){  
    
        //create an array of the SchoolTextBook object
        SchoolTextBook [] TextBooks = new SchoolTextBook[5];
        
        //instantiate objects and fill object array
        TextBooks[0] = new SchoolTextBook();
        TextBooks[1] = new SchoolTextBook();
        TextBooks[2] = new SchoolTextBook();
        TextBooks[3] = new SchoolTextBook();
        TextBooks[4] = new SchoolTextBook();
        
        //Fill each object
        TextBooks[0].setAuthor("Murach");
        TextBooks[0].setTitle("Java Programming");
        TextBooks[0].setISBN("978-1-890774-65-3");
        TextBooks[0].setPageCount(801);
        TextBooks[0].setPrice(24.68);
        
        TextBooks[1].setAuthor("Heldman");
        TextBooks[1].setTitle("Project Plus");
        TextBooks[1].setISBN("978-0-470-58592-4");
        TextBooks[1].setPageCount(323);
        TextBooks[1].setPrice(26.75);
        
        TextBooks[2].setAuthor("Goldberg");
        TextBooks[2].setTitle("XML");
        TextBooks[2].setISBN("978-0-321-55967-8");
        TextBooks[2].setPageCount(269);
        TextBooks[2].setPrice(45.99);
        
        TextBooks[3].setAuthor("Satzinger");
        TextBooks[3].setTitle("Object-Oriented Analysis & Design");
        TextBooks[3].setISBN("978-0-619-21643-6");
        TextBooks[3].setPageCount(626);
        TextBooks[3].setPrice(6.98);
        
        TextBooks[4].setAuthor("Gaddis");
        TextBooks[4].setTitle("Starting Out with Visual Basic");
        TextBooks[4].setISBN("978-0-321-53135-3");
        TextBooks[4].setPageCount(862);
        TextBooks[4].setPrice(5.14);
        
        // Display the books unsorted
        displaySort(TextBooks);
        
        //Get user input
        Scanner sc = new Scanner(System.in);
        
        int userInput = 0;
        while(userInput < 1 || userInput > 5){
        System.out.println("\n\n  Enter 1-5 to sort the books:");
		System.out.println("    1 - Author");
		System.out.println("    2 - Title");
		System.out.println("    3 - ISBN");
		System.out.println("    4 - PageCount");
		System.out.println("    5 - Price");
        System.out.println("    999 Exit");
        System.out.print("  >> ");
        userInput = sc.nextInt();
        
        //Handles user input
        switch(userInput){
			case 1: 
                sortAuthor(TextBooks);
                userInput = 0;
                break;
			case 2: 
				sortTitle(TextBooks);
                userInput = 0;
                break;
			case 3: 
				sortISBN(TextBooks);
                userInput = 0;
                break;
			case 4: 
				sortPageCount(TextBooks);
                userInput = 0;
                break;
			case 5: 
				sortPrice(TextBooks);
                userInput = 0;
                break;
			case 999: //exit the program
                System.exit(0);
                break;
			default:
            userInput = 0;
				break;
		}//End Switch block
        
        }//End While loop
        
    }//End of Main
    
    //Sort and Display Methods
    public static void displaySort(SchoolTextBook [] TextBooks){
        System.out.printf("\n\n\n\n%-17s%-40s%-25s%-20s%-5s\n", "  AUTHOR", "TITLE", "ISBN", "PAGE COUNT", "PRICE\n");
        for (int x = 0; x < TextBooks.length; x++)
          {
            System.out.printf("  %-15s%-40s%-30s%-15s$%-5.2f\n", TextBooks[x].getAuthor(), TextBooks[x].getTitle(),TextBooks[x].getISBN(), TextBooks[x].getPageCount(), TextBooks[x].getPrice());
          }
    }//End displaySort
    
    public static void sortAuthor(SchoolTextBook [] TextBooks){
        SchoolTextBook author;
        for (int x = 0; x < TextBooks.length - 1; x++){
            for (int y = 0; y < TextBooks.length - 1; y++){                            
                if (TextBooks[y].getAuthor().compareTo(TextBooks[y + 1].getAuthor()) > 0){
                    author = TextBooks[y];
                    TextBooks[y] = TextBooks[y + 1];
                    TextBooks[y + 1] = author;
                }
            }
        }
        //Display results
        displaySort(TextBooks);
    }//End sortAuthor
    
    public static void sortTitle(SchoolTextBook [] TextBooks){
        SchoolTextBook title;
        for (int x = 0; x < TextBooks.length - 1; x++){
            for (int y = 0; y < TextBooks.length - 1; y++){                            
                if (TextBooks[y].getTitle().compareTo(TextBooks[y + 1].getTitle()) > 0){
                    title = TextBooks[y];
                    TextBooks[y] = TextBooks[y + 1];
                    TextBooks[y + 1] = title;
                }
            }
        }
        //Display results
        displaySort(TextBooks);
    }//End sortTitle
    
    public static void sortISBN(SchoolTextBook [] TextBooks){
        SchoolTextBook isbn;
        for (int x = 0; x < TextBooks.length - 1; x++){
            for (int y = 0; y < TextBooks.length - 1; y++){                            
                if (TextBooks[y].getISBN().compareTo(TextBooks[y + 1].getISBN()) > 0){
                    isbn = TextBooks[y];
                    TextBooks[y] = TextBooks[y + 1];
                    TextBooks[y + 1] = isbn;
                }
            }
        }
        //Display results
        displaySort(TextBooks);
    }//End sortISBN
        
    public static void sortPageCount(SchoolTextBook [] TextBooks){
        SchoolTextBook pgcnt;
        for (int x = 0; x < TextBooks.length - 1; x++){
            for (int y = 0; y < TextBooks.length - 1; y++){                            
                if (TextBooks[y].getPageCount()>(TextBooks[y + 1].getPageCount())){
                    pgcnt = TextBooks[y];
                    TextBooks[y] = TextBooks[y + 1];
                    TextBooks[y + 1] = pgcnt;
                }
            }
        }
        //Display results
        displaySort(TextBooks);
    }//End sortPageCount

    public static void sortPrice(SchoolTextBook [] TextBooks){
        SchoolTextBook price;
        for (int x = 0; x < TextBooks.length - 1; x++){
            for (int y = 0; y < TextBooks.length - 1; y++){                            
                if (TextBooks[y].getPrice()>(TextBooks[y + 1].getPrice())){
                    price = TextBooks[y];
                    TextBooks[y] = TextBooks[y + 1];
                    TextBooks[y + 1] = price;
                }
            }
        }
        //Display results
        displaySort(TextBooks);
    }//End sortISBN
    
    

}//End of SchoolTextBookSort class