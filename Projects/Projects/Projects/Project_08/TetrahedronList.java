import java.text.DecimalFormat;
/**
* implements a list for Tetrahedron.
*
* @author Chase Hopkins - COMP-1213 - Project_08
* @version 3/26/21
*/

public class TetrahedronList {
   // variables //
   private String listName = "";
   private Tetrahedron[] ttList;
   private int arrSize;
 
     // constructor //
    /**
    * TetrahedronList constructor.
    *
    * @param listNameIn input for listName.
    * @param ttListIn input for ttList.
    * @param arrSizeIn input that resets arrSize variable. 
    */
   public TetrahedronList(String listNameIn, Tetrahedron[] ttListIn, 
      int arrSizeIn) {
   
      listName = listNameIn;
      ttList = ttListIn;
      arrSize = arrSizeIn;
   
   }
   
   /**
   * get name. 
   *
   * @return returns name of list. 
   */
   public String getName() {
      return listName;
   }
      
   /**
   * number of Tetrahedrons. 
   *
   * @return returns number of objects in array.
   */
   public int numberOfTetrahedrons() {
      return arrSize;
   }
   
    /**
    * total surface area.
    *
    * @return returns total surafce area.
    */
   public double totalSurfaceArea() {
      double total = 0;
      for (int i = 0; i < arrSize; i++) {
         total += ttList[i].surfaceArea();
      }
      return total;
   }
       
    /**
    * total volume.
    *
    * @return returns total volume. 
    */
   public double totalVolume() {
      double total = 0;
      for (int i = 0; i < arrSize; i++) {
         total += ttList[i].volume();
      }
      return total;
   }
       
    /**
    * avg surface area. 
    *
    * @return returns the avg surface area.
    */
   public double averageSurfaceArea() {
      double total = 0;
      for (int i = 0; i < arrSize; i++) {
         total += (ttList[i].surfaceArea()) / arrSize;
      }
      return total;
   }
       
    /**
    * avg volume. 
    *
    * @return returns the avg volume. 
    */
   public double averageVolume() {
      double total = 0;
      for (int i = 0; i < arrSize; i++) {
         total += (ttList[i].volume()) / arrSize;
      }
      return total;
   }
       
    /**
    * String to string. 
    *
    * @return returns output.
    */
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + listName + " -----";
      result += "\nNumber of Tetrahedrons: " + df.format(numberOfTetrahedrons())
         + arrSize;
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + " square units";
      result += "\nTotal Volume: " + df.format(totalVolume())
         + " cubic units";
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea())
         + " square units";
      result += "\nAverage Volume: " + df.format(averageVolume())
         + " cubic units"; 
            
      return result;
   }

   /**
   * gets list.
   *
   * @return ttList returns ttList.
   */
   public Tetrahedron[] getList() {
      return ttList;
   }
   
   /**
   * Adds a Tetrahedron to the list.
   *
   * @param labelIn takes in label.
   * @param edgeIn takes in edge. 
   */
   public void addTetrahedron(String labelIn, double edgeIn) {
      Tetrahedron t = new Tetrahedron(labelIn, edgeIn);
      ttList[arrSize] = t;
      arrSize++;
   }
   
   /**
   * finds Tetrahedron.
   *
   * @param labelIn takes in label.
   * @return returns object.
   */   
   public Tetrahedron findTetrahedron(String labelIn) {
         
      for (int i = 0; i < arrSize; i++) {
         if (ttList[i].getLabel().equalsIgnoreCase(labelIn)) {
            return ttList[i];
         }    
      }
      return null;
   }
       
    /**
    * deletes a Tetrahedron.
    *
    * @param labelIn takes label to delete.
    * @return returns deleted obj.
    */
   public Tetrahedron deleteTetrahedron(String labelIn) {
   
      Tetrahedron returnIt = null;
         
      for (int i = 0; i < arrSize; i++) 
      {
         if (ttList[i].getLabel().equalsIgnoreCase(labelIn))
         {
            returnIt = ttList[i];
            for (int x = i; x < (arrSize - 1); x++)
            {
               ttList[x] = ttList[x + 1];
            }
            ttList[arrSize - 1] = null;
            arrSize--;
            break;
         }
      }
      return returnIt;
   }
        
    /**
    * edits a Tetrahedron.
    *
    * @param labelIn labelIn.
    * @param edgeIn edgeIn.
    * @return returns result.
    */
   public boolean editTetrahedron(String labelIn, double edgeIn) {
   
      boolean result = false;
      for (int i = 0; i < arrSize; i++) {
         if (ttList[i].getLabel().equalsIgnoreCase(labelIn)) {
            ttList[i].setEdge(edgeIn);
            result = true;
         }
      }
      return result;
   }
        
    /**
    * Returns Tetrahedron with largest volume.
    * 
    * @return lv returns the tetrahedron
    * with largest volume.
    */
   public Tetrahedron findTetrahedronWithLargestVolume() {
     
      if (numberOfTetrahedrons() > 0) { 
         Tetrahedron largest = ttList[0]; 
         for (int i = 0; i < arrSize; i++)
         {
            if (ttList[i].volume() > largest.volume())
            {
               largest = ttList[i];
            }
         }
         return largest;
      }
      return null;
   }
}
        
       
     
       
       

         
