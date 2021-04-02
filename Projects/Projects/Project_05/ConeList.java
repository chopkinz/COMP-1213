import java.util.ArrayList;
import java.text.DecimalFormat;

/**
* Cone list app.
*
* @author Chase Hopkins - COMP-1213 - Project_05
* @version 2/19/2021
*/

public class ConeList 
{

    // --------- //
   // variables //
  // --------- //
   private String listName;
   private ArrayList<Cone> coneList;
     
    // ----------- //  
   // constructor //
  // ----------- //
  /**
  * Constructor for cone list.
  *
  * @param listNameIn user input for list name
  * @param coneListIn user input for Array List Name
  */
   public ConeList(String listNameIn, ArrayList<Cone> coneListIn) 
   {
      listName = listNameIn;
      coneList = coneListIn;
   }
   
    // ------- //
   // methods // 
  // ------- // 
  /**
  * gets the name.
  *
  * @return listName returns the name of list
  */
   public String getName() 
   {
      return listName;
   }
   
   /**
   * finds number of cones in ConeList.
   *
   * @return cone.size() returns int of
   * cone objects in list. Returns zero
   * if there are no objects in list.
   */
   public int numberOfCones() 
   {
      return coneList.size();
   }
   
   /**
   * finds the total base perimeter.
   *
   * @return returns total base perimeter. 
   */
   public double totalBasePerimeter() 
   {
      int index = 0;
      double totalBasePerimeter = 0;
      
      while (index < coneList.size()) 
      {
         Cone basePerimeterIndividual = coneList.get(index);
         totalBasePerimeter += basePerimeterIndividual.basePerimeter();
         index++;
      }
           
      return totalBasePerimeter;
   }

   /**
   * Finds total base area of cone objects in list.
   *
   * @return returns the total base area.
   */
   public double totalBaseArea() 
   {
      int index = 0;
      double totalBaseArea = 0;
      
      while (index < coneList.size()) 
      {
         Cone baseAreaIndividual = coneList.get(index);
         totalBaseArea += baseAreaIndividual.baseArea();
         index++;
      }
      return totalBaseArea;
   }
   
   /**
   * Finds total slant height of cone objects in list.
   *
   * @return returns total slant height. 
   */
   public double totalSlantHeight() 
   {
      int index = 0;
      double totalSlantHeight = 0;
      
      while (index < coneList.size()) 
      {
         Cone slantHeightIndividual = coneList.get(index);
         totalSlantHeight += slantHeightIndividual.slantHeight();
         index++;
      }
      
      return totalSlantHeight;
   }
   
   /**
   * Finds total side area of cone.
   *
   * @return returns total side area.
   */
   public double totalSideArea() 
   {
      int index = 0;
      double totalSideArea = 0;
      
      while (index < coneList.size()) 
      {
         Cone sideAreaIndividual = coneList.get(index);
         totalSideArea += sideAreaIndividual.sideArea();
         index++;
      }
      
      return totalSideArea;
   }
   
   /**
   * Finds total surface area.
   *
   * @return returns returns the total surface area.
   */
   public double totalSurfaceArea() 
   {
      int index = 0;
      double totalSurfaceArea = 0;
      
      while (index < coneList.size()) 
      {
         Cone surfaceAreaIndividual = coneList.get(index);
         totalSurfaceArea += surfaceAreaIndividual.surfaceArea();
         index++;
      }
      
      return totalSurfaceArea;
      
   }
   
   /**
   * Finds the total volume of cone.
   *
   * @return totalVolume returns total volume
   */
   public double totalVolume() 
   {
      int index = 0;
      double totalVolume = 0;
      
      while (index < coneList.size()) 
      {
         Cone volumeIndividual = coneList.get(index);
         totalVolume += volumeIndividual.volume();
         index++;
      }
      
      return totalVolume;
      
   }

/**
   * Finds average surface area.
   * 
   * @return averageSurfaceArea returns average
   * surface area.
   */
   public double averageSurfaceArea() 
   {
      double surfaceAreaTotal = 0;
      double averageSurfaceArea = 0;
      int index = 0;
      while (index < coneList.size()) 
      {
         Cone surfaceAreaIndividual = coneList.get(index);
         surfaceAreaTotal += surfaceAreaIndividual.surfaceArea();
         index++;
         averageSurfaceArea = surfaceAreaTotal / coneList.size();
      }
      
      return averageSurfaceArea;  
      
   }
   
   /**
   * Finds average volume.
   * 
   * @return averageVolume returns calculated avg volume
   */
   public double averageVolume() 
   {
      int index = 0;
      double averageVolume = 0;
      double volumeTotal = 0;
      while (index < coneList.size()) 
      {
         Cone volumeIndividual = coneList.get(index);
         volumeTotal += volumeIndividual.volume();
         index++;
         averageVolume = volumeTotal / coneList.size();
      }
      
      return averageVolume;
      
   }
   
   /**
   * String to String.
   * 
   * @return output returns output.
   */
   public String toString() 
   {
      int index = 0;
      String output = listName + "\n" + "\n";
      while (index < coneList.size()) {
         output += coneList.get(index) + "\n" + "\n";
         index++;
      }
   
      return output;
     
   }
   
   /**
   * Prints summary.
   *
   * @return returns summary.
   */
   public String summaryInfo() 
   {
      int index = 0;
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output = "";
      output += "----- Summary for " + listName + " -----"
         + "\nNumber of Cones: " + coneList.size()
         + "\nTotal Base Perimeter: " + df.format(totalBasePerimeter())
         + "\nTotal Base Area: " + df.format(totalBaseArea())
         + "\nTotal Slant Height: " + df.format(totalSlantHeight())
         + "\nTotal Side Area: " + df.format(totalSideArea())
         + "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + "\nTotal Volume: " + df.format(totalVolume())
         + "\nAverage Surface Area: " + df.format(averageSurfaceArea())
         + "\nAverage Volume: " + df.format(averageVolume());
   
      return output;
      
   }

}
