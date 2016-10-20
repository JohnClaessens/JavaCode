public class ConStat {
    public static void main(String[] args) {
        double fahrenheit; //declare fahrenheit
        double celsius; //declare celsius
        
        //assign fahrenheit
        fahrenheit = 70; //fahrenheit is now 70
    
        //convert to celsius
        celsius = (5.0/9.0) * (fahrenheit -32.0);

        //display results
        System.out.println("The conversion of fahrenheit to celsius" + fahrenheit + "is" + celsius);
    }
}