import java.text.DecimalFormat;
/**
* This program is derived from DirectMC. 
*
* @author Chase Hopkins - COMP-1213 - Project_10
* @version 4/7/21
*/
public class IndirectMC extends MarketingCampaign {
    //-----------// 
    // variables //
   //-----------//
   protected double costPerAd;
   protected int numberOfAds;
   
   /**
   * sets base cost. 
   */
   public static final double BASE_COST = 1500.0;
     //-------------//
    // constructor //
   //-------------//
   /**
   * Constructor for IndirectMC.
   * @param nameIn - name in.
   * @param revenueIn - revenue in. 
   * @param costPerAdIn - cost per ad in. 
   * @param numberOfAdsIn - number of ads in. 
   */
   public IndirectMC(String nameIn, double revenueIn, 
      double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn);
      
      costPerAd = costPerAdIn;
      numberOfAds = numberOfAdsIn;
   }
     //---------//
    // methods //
   //---------//
   /**
   * Gets cost per ad.
   * @return - returns cost per ad.
   */
   public double getCostPerAd() {
   
      return costPerAd;
   }
   
   /**
   * Sets cost per ad. 
   * @param costPerAdIn - cost per ad.
   */
   public void setCostPerAd(double costPerAdIn) {
      costPerAd = costPerAdIn;
   }
   
   /**
   * Gets number of ads. 
   * @return - returns number of ads. 
   */
   public int getNumberOfAds() {
      return numberOfAds;
   }
   
   /**
   * Sets number of ads. 
   * @param numberOfAdsIn - number of ads.
   */
   public void setNumberOfAds(int numberOfAdsIn) {
      numberOfAds = numberOfAdsIn;
   }
   
   /**
   * Gets base cost. 
   * @return - returns base cost. 
   */
   public double getBaseCost() {
      return BASE_COST;
   }
      
   /**
   * Calculates cost of campaign.
   * @return - returns campaign cost. 
   */
   public double campaignCost() {
      return (getBaseCost() + (costPerAd * numberOfAds));
   }
      
    /**
    * String to string.
    * @return - returns string. 
    */
   public String toString() {
      DecimalFormat mv = new DecimalFormat("$#,##0.00");
      return super.toString()
         + "\n   Base Cost: " + mv.format(getBaseCost())
         + "\n   Ad Cost: " + mv.format((costPerAd * numberOfAds)) 
         + " = " + mv.format(getCostPerAd()) 
         + " per ad * " + getNumberOfAds() + " ads";
   }
}