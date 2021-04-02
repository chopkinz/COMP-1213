import java.text.DecimalFormat;

/**
* This program evaluates a cone.
* 
* @author Chase Hopkins - Comp-1213 - Project_06
* @version 2/26/21
*/
public class Cone {
   private String label;
   private double radius;
   private double height;

     //-------------//
    // constructor //
   //-------------//
   
   /**
    * Creates cone object with label, radius and height for input.
    *
    * @param labelIn user input label.
    * @param radiusIn user input radius.
    * @param heightIn user input height.
    *
    */
   public Cone(String labelIn, double heightIn, double radiusIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setHeight(heightIn); 
   }
     //---------//
    // methods //
   //---------//
   
   /**
   * gets label.
   *
   * @return returns label for cone
   */
   public String getLabel() {
      return label;
   }
   
   /**
   * sets label.
   *
   * @param labelIn - label string
   * @return returns if label was modified boolean
   */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * gets height.
   *
   * @return height of cone
   */
   public double getHeight() {
      return height;
   }
   
   /**
   * sets height.
   *
   * @param heightIn - height to set cone
   * @return if height was modified boolean
   */
   public boolean setHeight(double heightIn) {
      if (heightIn > 0) {
         height = heightIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * gets radius.
   *
   * @return radius of cone
   */
   public double getRadius() {
      return radius;
   }
   
   /**
   * sets radius.
   *
   * @param radiusIn - radius to set cone
   * @return if radius was modified boolean
   */
   public boolean setRadius(double radiusIn) {
      if (radiusIn > 0) {
         radius = radiusIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * gets base perimeter.
   *
   * @return base perimeter of cone double
   */
   public double basePerimeter() {
      
      return 2 * Math.PI * radius;
   }
   
   /**
   * gets base area.
   *
   * @return base area of cone double
   */
   public double baseArea() {
      
      return Math.PI * Math.pow(radius, 2);
   }
   
   /**
   * gets slant height.
   *
   * @return slant height of cone double
   */
   public double slantHeight() {
      
      return Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
   }
   
   /**
   * gets side area.
   *
   * @return side area of cone double
   */
   public double sideArea() {
      
      return  Math.PI * radius * slantHeight();
   }
   
   /**
   * gets surface area.
   *
   * @return surface area of cone double
   */
   public double surfaceArea() {
      
      return Math.PI * radius * (radius + slantHeight());
   }
   
   /**
   * gets volume.
   *
   * @return volume of cone double
   */
   public double volume() {
   
      return Math.PI * Math.pow(radius, 2) * height / 3;
   }
   
   /**
   * converts to string.
   *
   * @return translates all values of cone to readable String
   */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      return "\"" + getLabel() + "\" is a cone with height = " + getHeight() 
         + " units and radius = " 
         + getRadius() + " units, \nwhich has base perimeter = " 
         + fmt.format(basePerimeter()) 
         + " units, base area = " + fmt.format(baseArea())
         + " square units, \nslant height = " + fmt.format(slantHeight()) 
         + " units, side area = " + fmt.format(sideArea())
         + " square units, \nsurface area = " + fmt.format(surfaceArea()) 
         + " square units, and volume = " + fmt.format(volume())
         + " cubic units.";
   }
   
}