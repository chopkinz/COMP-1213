import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

/**
* This is a menu that interacts with the Cone List.
* 
* @author Chase Hopkins - COMP-1213 - Project_06
* @version 2/26/21
*/

public class ConeListMenuApp {
   /**
   * Creates a ConeList object of decided name and list from a .txt file.
   * Allows the user to add, delete, edit, find specific cones.
   *
   * @param args - not used.
   * @throws IOException throws if I/O error encountered
   */
   public static void main(String[] args) throws IOException {
   	
      Scanner i = new Scanner(System.in);
      String name = "*** no list name assigned ***";
      ArrayList<Cone> empty = new ArrayList<Cone>();
      ConeList coneList = new ConeList(name, empty);
      char choice;
      String label;
      double height;
      double radius;
      
      
      System.out.println("Cone List System Menu\n"
         	+ "R - Read File and Create Cone List\n"
         	+ "P - Print Cone List\n"
         	+ "S - Print Summary\n"
         	+ "A - Add Cone\n"
         	+ "D - Delete Cone\n"
         	+ "F - Find Cone\n"
         	+ "E - Edit Cone\n"
         	+ "Q - Quit");
            
      // main loop //
      
      do {
      	
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         
         choice = i.nextLine().toUpperCase().charAt(0);
         
         switch (choice) {
            
            // reads file //
            case 'R':
            	
               System.out.print("\tFile name: ");
               name = i.nextLine();
               coneList = coneList.readFile(name);
               if (coneList != null) {
                  System.out.println("\tFile read in and Cone "
                     + "List created\n");
               }
               break;
            	
            // prints cone list //
            case 'P':
            	
               System.out.println("\n" + coneList.toString() + "\n");
               break;
            	
            // prints summary info //
            case 'S':
            	
               System.out.println("\n" + coneList.summaryInfo() 
                  + "\n");
               break;
            	
            // adds a cone //
            case 'A':
            	
               System.out.print("\tLabel: ");
               label = i.nextLine();
               System.out.print("\tHeight: ");
               height = Double.parseDouble(i.nextLine());
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(i.nextLine());
            	
               coneList.addCone(label, height, radius);
               System.out.println("\t*** Cone added ***\n");
               break;
            	
            // deletes a cone //
            case 'D':
            	
               System.out.print("\tLabel: ");
               label = i.nextLine();
               Cone d = coneList.deleteCone(label);
               System.out.println(d != null 
                  ? ("\t\"" + d.getLabel() + "\" deleted\n")
                  : ("\t\"" + label + "\" not found\n"));
               break;
            	
            // finds a cone //
            case 'F':
            	
               System.out.print("\tLabel: ");
               label = i.nextLine();
            	
               if (coneList.findCone(label) != null) {
                  System.out.println(coneList.findCone(label)
                           .toString() + "\n");
               }
               else {
                  System.out.println("\t\"" + label.trim() 
                     + "\" not found\n");
               }
               break;
            	
            // edits a cone //
            case 'E':
            	
               System.out.print("\tLabel: ");
               label = i.nextLine();
               System.out.print("\tHeight: ");
               height = Double.parseDouble(i.nextLine());
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(i.nextLine());
            	
               if (coneList.editCone(label, height, radius)) {
                  System.out.println("\t\"" + label.trim() 
                     + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label.trim() 
                     + "\" not found\n");
               }
               break;
            	
            // quits the program //
            case 'Q':
               break;
            	
         	// try again //
            default:
               System.out.println("\t*** invalid code ***\n");
         		
         }
         
      		   
      } while (choice != 'Q');
      
      
   }


}
