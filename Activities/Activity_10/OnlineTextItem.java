/**
* Online text item program for Activity_09.
* 
* @author Chase Hopkins - COMP-1213 - Activity_09
* @version 3/30/21
*/
public abstract class OnlineTextItem extends InventoryItem {
/**
* constructor.
*
* @param nameIn input for name
* @param priceIn input for price
*/
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
/**
* calculates the cost.
* @return returns the price.
*/
   public double calculateCost() {
      return price;
   }
   
   


}