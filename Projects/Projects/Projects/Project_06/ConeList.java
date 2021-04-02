import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
* This program evaluates a cone.
* 
* @author Chase Hopkins - COMP-1213 - Project_06
* @version 2/26/21
*/
public class ConeList {

   private String listName;
   private ArrayList<Cone> coneList;
   
   /**
   * Creates a ConeList object of decided name and list.
   *
   * @param nameIn - name
   * @param listIn - list
   */
     //-------------//
    // constructor //
   //-------------//
   public ConeList(String nameIn, ArrayList<Cone> listIn) {
      listName = nameIn;
      coneList = listIn;
   }
   
     //---------// 
    // methods //
   //---------//
   
   /**
   * Returns the name of the list.
   *
   * @return listName
   */
   
   public String getName() {
      return listName;
   }
   
   /**
   * Returns the number of cones in the list.
   *
   * @return size of coneList
   */
   
   public int numberOfCones() {
      return coneList.size();
   }
   
   /**
   * Totals up the base perimeter values of all cones.
   *
   * @return total base perimeter
   */
   
   public double totalBasePerimeter() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).basePerimeter();
         index++;
      }
      return total;
   }
   
   /**
   * Totals up the base area of all cones.
   *
   * @return total base area
   */
   
   public double totalBaseArea() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).baseArea();
         index++;
      }
      return total;
   }
   
   /**
   * Totals up the slant height of all cones.
   *
   * @return total slant height
   */
   
   public double totalSlantHeight() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).slantHeight();
         index++;
      }
      return total;
   }
   
   /**
   * Totals up the side area of all cones.
   *
   * @return total side area
   */
   
   public double totalSideArea() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).sideArea();
         index++;
      }
      return total;
   }
   
   /**
   * Totals up the surface area of all cones.
   *
   * @return total surface area
   */
   
   public double totalSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).surfaceArea();
         index++;
      }
      return total;
   }
   
   /**
   * Totals up the volume of all cones.
   *
   * @return total volume
   */
   
   public double totalVolume() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).volume();
         index++;
      }
      return total;
   }
   
   /**
   * Averages the surface area of all cones.
   *
   * @return average surface area
   */
   
   public double averageSurfaceArea() {
      if (coneList.size() > 0) {
         return totalSurfaceArea() / coneList.size();
      } 
      else {
         return 0;
      }
   }
   
   /**
   * Averages the volume of all cones.
   *
   * @return average volume
   */
   
   public double averageVolume() {
      if (coneList.size() > 0) {
         return totalVolume() / coneList.size();
      } 
      else {
         return 0;
      }
   }
   
   /**
   * Concatenates all of the cone object toString methods into one.
   *
   * @return String
   */
   
   public String toString() {
      String output = listName;
      int index = 0;
      while (index < coneList.size()) {
         output += "\n\n";
         output += coneList.get(index).toString();
         index++;
      }
      return output;
   }
   
   /**
   * Summarizes the methods of this class.
   *
   * @return String
   */
   
   public String summaryInfo() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      return "----- Summary for " + listName + " -----"
         + "\nNumber of Cones: " + coneList.size()
         + "\nTotal Base Perimeter: " + fmt.format(totalBasePerimeter())
         + "\nTotal Base Area: " + fmt.format(totalBaseArea())
         + "\nTotal Slant Height: " + fmt.format(totalSlantHeight())
         + "\nTotal Side Area: " + fmt.format(totalSideArea())
         + "\nTotal Surface Area: " + fmt.format(totalSurfaceArea())
         + "\nTotal Volume: " + fmt.format(totalVolume())
         + "\nAverage Surface Area: " + fmt.format(averageSurfaceArea())
         + "\nAverage Volume: " + fmt.format(averageVolume());
      
   }
   
   // methods project 6
   
   /**
   * Returns this Cone List object.
   *
   * @return coneList
   */
   public ArrayList<Cone> getList() {
      return coneList;
   }
   
   /**
   * Reads in a file and creates a ConeList object, throws
   * if I/O error.
   *
   * @param fileName name of file
   * @return ConeList
   * @throws IOException throws I/O error
   */
   public ConeList readFile(String fileName) throws IOException {
      Scanner scanFile = new Scanner(new File(fileName));
      
      String name = scanFile.nextLine();
      String label;
      double height, radius;
      ArrayList<Cone> temp = new ArrayList<Cone>();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         height = Double.parseDouble(scanFile.nextLine());
         radius = Double.parseDouble(scanFile.nextLine());
         temp.add(new Cone(label, height, radius));
      }
      
      return new ConeList(name, temp);
   }
   
   /**
   * Adds a cone to this ConeList.
   *
   * @param label of cone
   * @param height of cone
   * @param radius of cone
   */
   public void addCone(String label, double height, double radius) {
      coneList.add(new Cone(label.trim(), height, radius));
   }
   
   /**
   * Finds and returns Cone in this list of indidcated label.
   *
   * @param label of cone
   * @return Cone
   */
   public Cone findCone(String label) {
      for (Cone i : coneList) {
         if (i.getLabel()
                  .equalsIgnoreCase(label.trim())) {
            
            return i;
            
         }
      }
      return null;
   }
   
   /**
   * Finds, deletes and returns Cone of specified label.
   *
   * @param label of cone
   * @return Cone
   */
   public Cone deleteCone(String label) {
      for (Cone i : coneList) {
         if (i.getLabel()
                  .equalsIgnoreCase(label.trim())) {
            Cone d = i;
            coneList.remove(i);
            return d;
            
         }
      }
      
      return null;
   }
   
   /**
   * Finds and edits specified cone to specified input.
   *
   * @param label of cone
   * @param height of new cone
   * @param radius of new cone
   * @return boolean
   */
   public boolean editCone(String label, double height, double radius) {
      for (int i = 0; i < coneList.size(); i++) {
         if (coneList.get(i).getLabel()
                  .equalsIgnoreCase(label.trim())) {
            coneList.remove(i);
            coneList.add(i, new Cone(label, height, radius));
            
            return true;
            
         }
      }
      return false;
   }
   
}
