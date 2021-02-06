import java.util.Scanner;
import java.text.DecimalFormat;

/** 
*
* This program evaluates an expression after the 
* user enters a value.
*
* @author Chase Hopkins - COMP-1213 - Project_03
* @version 2/5/2021
*/

public class SolveIt {

/**
*
* Prompts the user to enter a value for x then evaluates  
* a set equation using the value of x entered by the user.
*
* @param args Command line arguments (not used).
*/

   public static void main(String[] args) {
      
      // declares variables 
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      
      // prompts user to enter a value for x
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      // solves equation using the x value entered and prints 
      double result = (6 * Math.pow(x, 3) + Math.sqrt(3 * Math.pow(x, 2) 
         + (2 * x) + 1)) / (2 * Math.abs(x) + 4);
      System.out.println("Result: " + result);
      
      // determines deciLeft and deciRight
      String resultString = Double.toString(result);
      int integerPlaces = resultString.indexOf('.');
      int deciLeft = integerPlaces; 
      int deciRight = resultString.length() - integerPlaces - 1;
      
      // prints result format 
      System.out.println("# of characters to left of decimal point: " 
         + deciLeft);
      System.out.println("# of characters to right of decimal point: " 
         + deciRight);
     
     // formats results and prints
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String formatted = df.format(result);
      System.out.println("Formatted Result: " + df.format(result));
      
   }
}


