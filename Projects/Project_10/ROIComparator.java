import java.util.Comparator;

/**
* Defines ordering from lowest to highest based
* on the ROI. 
*
* @author Chase Hopkins - COMP1213 - Project_10
* @version 4/7/21
*/
public class ROIComparator implements Comparator<MarketingCampaign> {
/**
   * Compares based on ROI.
   * @param c1 MC 1
   * @param c2 MC 2
   * @return Int indicating if c1 is greater than,
   * equal to, or less than c2.
   */
   public int compare(MarketingCampaign c1, MarketingCampaign c2) {
      if (c1.calcROI() > c2.calcROI()) {
         return -1; // if greater, move up the list 
      }
      else if (c1.calcROI() < c2.calcROI()) {
         return 1; // if lesser, move down the list 
      }
      return 0; // if equal, do nothing 
   }

}