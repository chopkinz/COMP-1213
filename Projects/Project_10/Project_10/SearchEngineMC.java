/**
* This program is derived from IndirectMC. 
*
* @author Chase Hopkins - COMP-1213 - Project_09
* @version 4/7/21
*/
public class SearchEngineMC extends IndirectMC {
  //-----------// 
 // variables //
//-----------//
/**
* Sets base cost. 
*/
   public static final double BASE_COST = 2000.00; 
  //-------------//
 // constructor //
//-------------//
/**
* Constructor for SearchEngineMC. 
* @param nameIn name. 
* @param revenueIn revenue
* @param costPerAdIn cost per ad. 
* @param numberOfAdsIn number of ads. 
*/
   public SearchEngineMC(String nameIn, double revenueIn, 
      double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn, costPerAdIn, numberOfAdsIn);
   }
  //---------//
 // methods //
//---------//
/**
* Gets base cost. 
* @return returns base cost. 
*/
   public double getBaseCost() {
      return BASE_COST;
   }
}