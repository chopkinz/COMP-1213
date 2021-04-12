import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* tests for MarketingCampaign.
*
* @author Chase Hopkins - COMP-1213 - Project_09
* @version 4/7/21
*/
public class MarketingCampaignTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** tests setName. **/
   @Test public void setNameTest() {
      IndirectMC mc = new IndirectMC("Wed Ads 1", 15000.00, 2.0, 3500);
      mc.setName("newTest");
      Assert.assertEquals("newTest", mc.getName());
   }
      
      /** tests setRevenue. **/
   @Test public void setRevenueTest() {
      IndirectMC mc = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      mc.setRevenue(0.1);
      Assert.assertEquals("", 0.1, mc.getRevenue(), .000001);
   }
      
      /** tests getCount. **/
   @Test public void getCountTest() {
      IndirectMC mc = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      mc.resetCount();
      Assert.assertEquals("", 0, mc.getCount());
   
   }
}
