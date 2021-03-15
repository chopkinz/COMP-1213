import java.util.Scanner;

/** 
* App prompts the user to enter the 
* label, height, and radius. 
*
* @author Chase Hopkins - COMP-1213 - Project_04
* @version 2/11/2021
*/

public class ConeApp 
{
   /**
   * Cone app.
   @param args argument (not used)
   */
   
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String label = "";
      double height = 0;
      double radius = 0;
      Cone cone = new Cone(label, height, radius);
       
   // prompts user for label
      System.out.print("Enter label, height, and radius for a cone."
                     + "\n\tlabel: ");
      label = (userInput.nextLine());
      
   // prompts user for height
      System.out.print("\theight: ");
      height = Double.parseDouble(userInput.nextLine());
    
      // checks height  
      if (height <= 0) {
         System.out.print("Error: height must be greater than 0.");
         return; }
       
      // checks radius
      System.out.print("\tradius: ");
      radius = Double.parseDouble(userInput.nextLine());
      
      if (radius <= 0) {
         System.out.print("Error: radius must be greater than 0.");
         return; }
      
      // instance methods 
      Cone newCone = new Cone(label, height, radius);
      System.out.println(newCone.toString());
         
         
   }  
       
}
