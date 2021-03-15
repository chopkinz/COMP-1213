import java.util.Scanner;
    
/**
* This program allows the user to enter an amount
* of petroleum in ounces, which must not exceed
* 1 billion, and then displays the number of
* barrels, gallons, quarts, and ounces.
*
* @author : Chase Hopkins - COMP 1213 - Project_02
* @version : 1/28/2021
*/

public class PetroleumUnits {

/** prompts the user to enter the amount of petroleum 
* in ounces and prints how many barrels/gallons/quarts/ounces
* the entered amount can fit in.
*
* @param args - Standard commandline arguments (not used)
*/ 

   public static void main(String[] args) {
      
      // declares variables for barrels, gallons, quarts, and ounces
      Scanner userInput = new Scanner(System.in);
      int liquidOunces = 0;
      int barrels = 0;
      int gallons = 0;
      int quarts = 0;
      int ounces = 0;
      
      // prompts the user for amount of petroleum in ounces 
      System.out.print("Enter amount of petroleum in ounces: ");
      liquidOunces = userInput.nextInt();
      
      // declares variables
      barrels = liquidOunces / 5376;
      gallons = (liquidOunces % 5376) / 128;
      quarts = (liquidOunces % 5376 % 128) / 32;
      ounces = liquidOunces % 5376 % 128 % 32;
      
      if (liquidOunces >= 1000000000) {
         
         // determines if input is over 1,000,000,000
         System.out.print("Amount must not exceed 1,000,000,000.");
      }        
      
      else {
         
         // prints values for barrels, gallons, quarts, and ounces
         System.out.println("Petroleum amount in units:");
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + ounces);
         
         // prints calculations to the screen 
         System.out.print(liquidOunces + " oz = (" + barrels + " bl * 5376 oz) "
            + "+ (" + gallons + " gal * 128 oz) + (" + quarts + " qt * 32 oz) "
            + "+ (" + ounces + " oz)");
      }
     
   }
}