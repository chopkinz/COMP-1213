import java.text.DecimalFormat;

/** 
* This program defines right circular Cone objects
* where height and radius are positive.
*
* @author Chase Hopkins - COMP-1213 - Project_04
* @version 2/11/2021
*/

public class Cone {
   
   // variables 
   private String label;
   private double height = 0;
   private double radius = 0;
   
   // constructor //
   /**
   *
   * Constructor that accepts three parameters, 
   * label, height, and radius of cone.
   *
   * @param labelIn prompts user to enter label 
   * @param heightIn prompts user to enter height
   * @param radiusIn prompts user to enter radius 
   */
   public Cone(String labelIn, double heightIn, double radiusIn) {
      setLabel(labelIn);
      setHeight(heightIn);
      setRadius(radiusIn);  
   }
      
   /**
   * gets the label.
   * @return returns label 
   */
   public String getLabel() {
      return label;
   }
   
   // methods //
   /**
   * sets the label.
   * @param labelIn label 
   * @return label returns the label 
   */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn == null) {
         isSet = false;
      }
      else {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   
   /**  
   * gets the height.
   * @return height
   */
   public double getHeight() {
      return height;
   }
   
   /**
   * sets the height.
   * @param heightIn height
   * @return returns height.
   */
   public boolean setHeight(double heightIn) {
      boolean isSet = false;
      if (heightIn > 0) {
         height = heightIn;
         isSet = true;
      }
      else {
         isSet = false;
      }
      return isSet;
   }
   
    /**  
    * gets the radius.
    * @return returns radius.
    */
   public double getRadius() {
      return radius;
   }
   
    /**  
    * prompts the user to enter the radius. 
    * @param radiusIn user input for radius 
    * @return isSet determines true or false 
    */
   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
      if (radiusIn > 0) {
         radius = radiusIn;
         isSet = true;
      }
      else {
         isSet = false;
      }
      return isSet;
   }
   
    /**  
    * calculates the perimeter of base.
    *  @return basePerimeter returns perimeter 
    */
   public double basePerimeter() {
      return (2 * Math.PI * radius);
   }
   
    /**  
    * calculates the base area.
    * @return baseArea returns base area
    */
   public double baseArea() {
      return (Math.PI * Math.pow(radius, 2));
   }
   
    /**  
    * calculates the slant height. 
    * @return slantHeight returns slant height 
    */
   public double slantHeight() {
      return Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
   }
   
    /**  
    * calculates the side area. 
    * @return sideArea returns side area 
    */
   public double sideArea() {
      return Math.PI * radius * slantHeight();
   }
   
    /**  
    * calculates the radius of base.
    * @return surfaceArea returns surface area 
    */
   public double surfaceArea() {
      return (Math.PI * radius * (radius + slantHeight()));
   }
   
    /**  
    * calculates the volume. 
    * @return volume returns volume 
    */
   public double volume() {
      return Math.PI * Math.pow(radius, 2) * (height / 3);
   }
   
    /**  
    * prints the output.
    * @return toString returns output 
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "\"" + label + "\" is a cone with "
          + "height = " + df.format(height) + " units "
          + "and radius = " + df.format(radius) + " units,\n";
      output += "which has "
          + "base perimeter = " + df.format(basePerimeter()) + " units,"
          + " base area = " + df.format(baseArea()) + " square units,\n";
      output += "slant height = " + df.format(slantHeight()) + " units,"
          + " side area = " + df.format(sideArea()) + " square units,\n";
      output += "surface area = " + df.format(surfaceArea()) + " square units,"
          + " and volume = " + df.format(volume()) + " cubic units.";
      return output;
   }
  
}