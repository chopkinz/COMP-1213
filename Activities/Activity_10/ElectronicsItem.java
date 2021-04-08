/**
* Electronics item program for Activity_09.
*
* @author Chase Hopkins - COMP-1213 - Activity_09
* @version 3/30/21
*/
public class ElectronicsItem extends InventoryItem {
   // variables //
   protected double weight;
   
   /** shipping cost. */
   public static final double SHIPPING_COST = 1.5;
   
   /**
   * constructor.
   *
   * @param nameIn input for the name.
   * @param priceIn input for the price.
   * @param weightIn input for the weight.
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   /**
   * caclulates the cost.
   *
   * @return returns the calculated cost.
   */
   public double calculateCost() {
      return super.calculateCost() +  (SHIPPING_COST * weight); 
   }
         
      



}

