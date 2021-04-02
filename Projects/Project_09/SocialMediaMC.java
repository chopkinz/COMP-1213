/**
* This program is derived from IndirectMC. 
*
* @author Chase Hopkins - COMP-1213 - Project_09
* @version 4/2/21
*/
public class SocialMediaMC extends IndirectMC {
    //-----------// 
   // variables //
  //-----------// 
  /**
  * sets base cost. 
  */
   public static final double BASE_COST = 3000.0;   
   //-------------//
  // constructor //
 //-------------//
 /**
 * Constructor for SocialMediaMC.  
 * @param nameIn - name. 
 * @param revenueIn - revenue. 
 * @param costPerAdIn - cost per ad. 
 * @param numberOfAdsIn - number of ads. 
 */
   public SocialMediaMC(String nameIn, double revenueIn, 
      double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn, costPerAdIn, numberOfAdsIn);
   }
      //---------//
     // methods //
    //---------// 
    /**
    * gets base cost. 
    * @return - returns base cost. 
    */
   public double getBaseCost() {
      return BASE_COST;
   }
}
