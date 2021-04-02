import java.text.DecimalFormat;

/**
* defines Tetrahedron objects.
*
* @author Chase Hopkins - COMP-1213 - Project_07B
* @version 3/16/21
*/

public class Tetrahedron implements Comparable<Tetrahedron> {
   // variables //
   private String label = "";
   private double edge = 0;
   private static int count = 0; 
   
// constructor //
/**
* Tetrahedron constructor.
*
* @param labelIn user input for label
* @param edgeIn user input for baseEdge
*/
   public Tetrahedron(String labelIn, double edgeIn) 
   {
      setLabel(labelIn);
      setEdge(edgeIn);
      count++;
   }
   
// methods //
/**
* gets label.
*
* @return String label.
*/
   public String getLabel() 
   {
      return label;
   }
      
/**
* sets label.
*
* @param labelIn userinput for label
* @return isSet returns if it is set or not
*/
   public boolean setLabel(String labelIn) 
   {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }   
   }
      
/**
* gets base edge.
*
* @return returns baseEdgeIn
*/
   public double getEdge() 
   {
      return edge;
   }
      
/**
* sets base edge.
*
* @param edgeIn user input for base edge
* @return returns isSet true or false
*/
   public boolean setEdge(double edgeIn) 
   {
      boolean isSet = false;
      if (edgeIn >= 0) 
      {
         edge = edgeIn;
         isSet = true;
      }
      return isSet;
   } 
      
/**
* calculates height.
*
* @return returns height value
*/
   public double height() { 
      return Math.sqrt(2.0 / 3.0) * edge; 
   }
   
/**
* calculates the surface area.
*
* @return returns surfaceArea
*/
   public double surfaceArea() {
      double surfaceArea = Math.sqrt(3.0) * Math.pow(edge, 2.0);
   
      return surfaceArea;
   }
   
   /**
   * calculates volume.
   *
   * @return returns calculated volume
   */
   public double volume() {
      double volume = (Math.pow(edge, 3.0)) / (6.0 * Math.sqrt(2.0));
      return volume;
   }
   
   /**
   * gets count.
   *
   * @return returns count
   */
   public static int getCount() {
      return count;
   }
   /**
   * resets count.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   * checks if equals tetra.
   *
   * @param obj input
   * @return true or false
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof Tetrahedron)) {
         return false;
      }
      else {
         Tetrahedron d = (Tetrahedron) obj;
         return (label.equalsIgnoreCase(d.getLabel())
                && Math.abs(edge - d.getEdge()) < .000001);
      }
   }
   
   /**
   * hash code required by check style.
   *
   * @return returns 0 type int
   */
   public int hashCode() {
      return 0;
   }
   
   /**
   * string to string.
   *
   * @return returns output
   */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      return "Tetrahedron \"" + label
         + "\" with six edges of length " + edge + " has:\n\t"
         + "height = " + fmt.format(height()) + " units\n\t"
         + "surface area = " + fmt.format(surfaceArea()) + " square units\n\t"
         + "volume = " + fmt.format(volume()) + " cubic units";
   }
   
   /**
    * compare to.
    *
    * @param obj compareTo 
    * @return compared
    */
   public int compareTo(Tetrahedron obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0; // consider them equal and return 0
      }
      else if (this.volume() < obj.volume()) {
         return -1; // should return a negative number 
      }
      else {
         return 1; // should return a positive number
      }
      
   }

}