import java.text.DecimalFormat;
/**
* Program that describes marketing campaign
* data and provides methods to access the data.
*
* @author Chase Hopkins - COMP-1213 - Project_10
* @version 4/7/21
*/
public abstract class MarketingCampaign {
     //-----------// 
    // variables //
   //-----------//
   protected String name;
   protected double revenue;
   protected static int mktgObj = 0;
     //-------------//
    // constructor //
   //-------------//
   /**
   * Constructor for MarketingCampaign.
   * @param nameIn - used
   * @param revenueIn - used
   */
   public MarketingCampaign(String nameIn, double revenueIn) {
   
      name = nameIn;
      revenue = revenueIn;
      mktgObj++;
   } 
     //---------//
    // methods //
   //---------//
   /**
   * Gets the name. 
   * @return - returns the name. 
   */
   public String getName() {
      return name; 
   }
   
   /**
   * Sets the name. 
   * @param nameIn - used
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
   * Gets the revenue.
   * @return - returns the revenue.
   */
   public double getRevenue() {
      return revenue;
   } 
   
   /**
   * Sets the revenue.
   * @param revenueIn - used
   */  
   public void setRevenue(double revenueIn) {
      revenue = revenueIn;
   }
   
   /**
   * Gets the count.
   * @return - returns the count.
   */
   public static int getCount() {
      return mktgObj;
   }
   
   /**
   * Resets the count. 
   */
   public static void resetCount() {
      mktgObj = 0;
   }
    
    /**
    * Calculates ROI.
    * @return - returns ROI.
    */
   public double calcROI()  {
    
      double roi = (revenue - campaignCost()) / campaignCost();
      return roi;
   
   }
    
    /**
    * String to string. 
    * @return - returns output.
    */   
   public String toString() {
         
      DecimalFormat mv = new DecimalFormat("$#,##0.00");
      DecimalFormat roi = new DecimalFormat("0.##%");
      return getName() + " (" + this.getClass() + ")" + "\nRevenue: "
         + mv.format(getRevenue()) + "   Campaign Cost: " 
         + mv.format(campaignCost()) + "   ROI: " 
         + roi.format(calcROI());
   }
      
    /**
    * Returns the cost of the campaign.
    * @return - returns campaign cost.
    */
   public abstract double campaignCost();
   
    /**
    * compare to.
    * @param obj - MarketingCampaign object 
    * @return - int representing order of list 
    */
   public int compareTo(MarketingCampaign obj) {
      return this.getName().toLowerCase()
         .compareTo(obj.getName().toLowerCase());
   }
}
    
      
