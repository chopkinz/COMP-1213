import java.util.Scanner;
    
/**
* The program finds the result of a specified
* expression after reading input values for x, y and z.
* 
* @author : Chase Hopkins - COMP 1213 - Project_02
* @version : 1/28/2021
*/

public class ExpressionSolver
{
   
   /** 
   * Inputs values of type double for x, y, and z
   * and solves for the result of the formula. 
   * @param args - Standard commandline arguments (not used)
   */
   
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      double x, y, z, result;
      
      System.out.println("result = (9x + 6.25) (6y - 4.5) (3z + 2.75) / xyz");
      
      // prompts user to enter values for x, y, and z
      System.out.print("\tx = "); 
      x = userInput.nextDouble();  
      System.out.print("\ty = "); 
      y = userInput.nextDouble(); 
      System.out.print("\tz = ");
      z = userInput.nextDouble(); 
      
      if (x * y * z == 0) // print undefined if result is 0
      {
         System.out.println("result is \"undefined\"");
      }
      else // solve the equation  
      {
         result = (((9 * x) + 6.25) * ((6 * y) - 4.5) * ((3 * z) + 2.75)) 
            / (x * y * z);
         System.out.print("result = " + result);
      }
     
      
   }
}