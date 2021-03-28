/**
* Inventory item program for Activity_09.
*
* @author Chase Hopkins - COMP-1213 - Activity_09
* @version 3/30/21
*/
public class InventoryItem {
   // variables //
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   // constructor //
   /**
   * constructor.
   * 
   * @param takes in the name. 
   * @param takes in the price. 
   */
   public InventoryItem(String nameIn, double pricein) {
      name = nameIn;
      price = pricein;
   }
         
      // methods //
      /**
      * gets the name. 
      *
      * @return returns the name.
      */
   public String getName() {
      return name;
   }
      
      /**
      * calculates the cost.
      * @return returns the calculated cost.
      */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
      /**
      * sets the tax rate.
      * @param taxRateIn takes input for tax rate. 
      */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
      /**
      * string to string.
      * @return returns the string.
      */
   public String toString() {
      return name + ": $" + calculateCost();
   }
   
}
         
      
