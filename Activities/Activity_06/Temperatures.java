import java.util.ArrayList;

/**
* Temps class.
*
* @author Chase Hopkins - COMP-1213 - Activity_06
* @version 2/23/21
*/
public class Temperatures {

  //-----------//
 // variables //
//-----------//
   private ArrayList<Integer> temperatures; 
   
  //-------------//
 // constructor //
//-------------//
/**
* constructor for temps.
*
* @param temperaturesIn input for temps. 
*/
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
/**
* gets lowest temp.
*
* @return returns lowest temp.
*/
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i); 
         }
      }
      return low;
   }
   
/**
* gets highest temp.
*
* @return returns highest temp.
*/
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   
/**
* lower minimum. 
*        
* @param lowIn input
* @return returns lower min
*/
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
/**
* higher maximum.
*
* @param highIn input
* @return returns output
*/
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
/**
* String to string.
*
* @return returns String containing 
* low and high temps. 
*/
   public String toString() {
      return "\tTemperatures: " + temperatures 
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}


