/**
* holds an array of values.
*
* @author Chase Hopkins - COMP-1213 - Activity_08
* @version 3/23/21
*/

public class Scores {
      // variables //
   private int[] numbers; 
      
    // constructor //
/**
* Scores constructor.
*
* @param numbersIn takes in and assigns numbers.
*/
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
     
   // methods // 
   /**
   * @return returns even in the array.
   */
   public int[] findEvens() {
      int numberEvens = 0;
         
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++; 
         }
      } 
      return evens;
   }
      
    /**
    * @return returns odds in the array.
    */
   public int[] findOdds() {
      int numberOdds = 0;
         
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {   
            
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
    
      
    /**
    * @return returns the average of elements in the array.
    */
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return ((double) sum / numbers.length);
   }
    
    /**
    * @return String to String. 
    */
   public String toString() {
      String result = "";
            
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
       
   }
       
     /**
     * @return returns the array in reverse,
     */
   public String toStringInReverse() {
      String result = "";
            
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }        
      return result;
      
   }
}