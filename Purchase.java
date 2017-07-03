//  John Claessens
//  Assignment 3.2
//  Purchase
//  Bellevue University
//  03 July 2017

import java.util.Scanner;

public class Purchase {  
    
    // Each Purchase contains an invoice number, amount of sale, and amount of sales tax.  
    private static double dblTaxRate = 0.075;
    private int intInvoiceNumber;
    private double dblSaleAmount;
    private double dblSalesTaxAmount;
    
    //setter for the Invoice Number
    public void setInvoiceNumber(int invNum){
        intInvoiceNumber = invNum;
    }
    //setter for the sales amount
    public void setSaleAmount(double saleAmt){
        dblSaleAmount = saleAmt;
        dblSalesTaxAmount = saleAmt * Purchase.dblTaxRate;
    }
    
    //Method to display the results
    public static void displayInvoice(Purchase sale){
        System.out.println("\n\n\tBill of Sale");
        System.out.println("  Invoice Number: " + sale.intInvoiceNumber);
        System.out.printf("  Sales Amount  : $%8.2f" , sale.dblSaleAmount);
        System.out.printf("\n  Sales Tax     : $%8.2f" , sale.dblSalesTaxAmount);
        //get and display a grand total
        double dblTotal = sale.dblSaleAmount + sale.dblSalesTaxAmount;
        System.out.printf("\n  Grand Total   : $%8.2f" , dblTotal);
    }
    
    //Main Method
    public static void main(String [] args){
        //declare variables
        int intInvoice;
        double dblSaleAmt;
      
        // creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("  Please enter the Invoice Number > ");
        intInvoice = sc.nextInt();   
        System.out.print("  Please enter the Sale Amount > ");
        dblSaleAmt = sc.nextDouble();
        
         //create instance of Purchase
        Purchase sale = new Purchase();
        sale.setInvoiceNumber(intInvoice);
        sale.setSaleAmount(dblSaleAmt);
        displayInvoice(sale);
        
  }//End of main method
  
}//end of Purchase class