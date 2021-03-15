import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/** 
* This program uses data entered by the user
* to determine the contents of a ticket to Mars.
*
* @author Chase Hopkins - COMP-1213 - Project_03
* @version 2/5/2021
*/

public class MarsTicket {

 /**
 * Uses the entered data (ticket) to return the date of
 * takeoff, the time, the seat number,
 * the price (incuding the discount if available),
 * and a random prize number.
 *
 * @param args Command line arguments (not used).
 */

   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      DecimalFormat dfp = new DecimalFormat("0%");
      Random generator = new Random();
      String input = "";
      
      String month = "";
      String day = "";
      String year = "";
      
      String hr = "";
      String min = "";
      
      String seat = "";
      
      int discount = 0;
   
      double price = 0.0;
      double cost = 0.0;
        
      int prize = 0;
      
      String description = "";
      
      
      // prompts user to enter ticket code 
      System.out.print("Enter ticket code: ");
      input = scan.nextLine().trim();
      System.out.println("");
      
      if (input.length() < 27) {
         System.out.println("*** Invalid Ticket Code ***"
            + "\nTicket code must have at least 27 characters.");
      }
      
      else {
        
        // ticket
         description = input.substring(26);
         System.out.print("Ticket: " + description);
        
         // date
         month = input.substring(15, 17);
         day = input.substring(17, 19);
         year = input.substring(19, 23);
         System.out.print("   Date: " + month + "/" + day + "/" + year);
         
         // time
         hr = input.substring(11, 13);
         min = input.substring(13, 15);
         System.out.print("   Time: " + hr + ":" + min);
         
         // seat
         seat = input.substring(23, 26);
         System.out.print("   \nSeat: " + seat);
         
         // price
         price = Integer.parseInt(input.substring(0, 9)) / 100;
         System.out.print("   Price: " + df.format(price));
         
         // discount
         discount = Integer.parseInt(input.substring(9, 11));
         System.out.print("   Discount: " + discount + "%");
         
         // cost
         cost = price - (price * (0.01 * discount));
         System.out.print("   Cost: " + df.format(cost));
         
         // prize
         prize = (int) (Math.random() * 999999 + 1);
         System.out.println("\nPrize Number: " + prize);
      }
   }
}