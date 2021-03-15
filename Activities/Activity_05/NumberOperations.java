   /** 
   * This program holds an integer value and 
   * provides methods to perform various 
   * operations on that value. 
   *
   * @author Chase Hopkins - COMP-1213 - Activity_05
   * @version 2/17/21
   */

public class NumberOperations {
   // instance variables //
   private int number;
   
// ----------- //
// constructor //
// ----------- //   
/**
* constructor for NumberOperations.
* @param numberIn number into constructor from driver. 
*/
   public NumberOperations(int numberIn) {
      number = numberIn;
   }

// ------- //
// methods //
// ------- //
/** 
* gets value.
* @return getValue returns value. 
*/
   public int getValue() {
      return number; 
   }

/**
* odds under.
* @return returns output. 
*/
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
   /**
   * powers.
   * @return returns string of numbers that can be powered. 
   */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; // concatenate to ouput 
         powers = powers * 2; // get next power of 2
      }
      return output;
   }
   
   /**
   * is greater.
   * @return returns positive, negative, or zero. 
   * @param compareNumber compares to input
   */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      } else if (number < compareNumber) {
         return -1;
      } else {
         return 0;
      }
   }
   
   /** 
   * string to string. 
   * @return returns numbers.
   */
   public String toString() {
      return number + "";
   }
}
