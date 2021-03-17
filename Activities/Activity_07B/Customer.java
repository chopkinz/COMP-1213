/**
* customer program.
*
* @author Chase Hopkins - COMP-1213 - Activity_7B
* @version 3/15/21
*/
public class Customer implements Comparable<Customer> {
   
      // variables //
   private String name;
   private String location;
   private double balance;  
      
        // methods //
    /**
    * customer constructor.
    * @param nameIn input for name
    */
   public Customer(String nameIn) {
      name = nameIn; // sets name to parameter input 
      location = ""; // sets location to empty string 
      balance = 0; // sets balance to 0 
   }
 
    /**
    * sets location.
    * @param locationIn input for location
    */
   public void setLocation(String locationIn) { 
    // sets location variable 
      location = locationIn;
   }
    
    /**
    * checks location two paramaters.
    * @param city input
     *@param state input
    */
   public void setLocation(String city, String state) { 
    // setLocation overload
      location = city + ", " + state; 
   } 
    
    /**
    * changes balance.
    * @param amount input for balance
    */
   public void changeBalance(double amount) { 
    // add amount to balance 
      balance += amount;
   }
   
    /**
    * gets location.
    * @return location
    */
   public String getLocation() { 
    // returns variable for location
      return location;
   }
    
    /**
    * gets balance.
    * @return returns balance
    */
   public double getBalance() { 
    // returns varaible for balance
      return balance;
   }
   
    /**
    * String to string.
    * @return output string
    */
   public String toString() {
      String output = name + "\n" + location + "\n$" + balance;
   
      return output;
   }
       
    /**
    * compare to.
    * @param obj aj
    * @return compared
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0; // consider them equal and return 0
      }
      else if (this.balance < obj.getBalance()) {
         return -1; // should return a negative number 
      }
      else {
         return 1; // should return a positive number
      }
      
   }
}
