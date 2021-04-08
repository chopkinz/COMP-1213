/** 
* Items List program for Activity_10.
*
* @author Chase Hopkins - COMP-1213 - Activity_10
* @version 4/2/21
*/
public class ItemsList {
   // variables //
   private InventoryItem[] inventory;
   private int count;
/**
* Constructor. 
*/
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   // constructor //
/**
* adds item. 
* @param itemIn - takes in an object to add it to the list.
*/
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
/**
* calculates total. 
* @return returns the cost after it has been calculated
* @param electronicsSurcharge takes ina double to multiple
*/
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         } else {
            total += inventory[i].calculateCost();
         }
      }
      
      return total;
   }
/**
* String to string. 
* @return returns the toString of the inventory
*/
   public String toString() {
      String result = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         result += inventory[i] + "\n";
      }
      
      return result;
   }
}