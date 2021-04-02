import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* tests for IndirectMC.
*
* @author Chase Hopkins - COMP-1213 - Project_09
* @version 4/2/21
*/
public class IndirectMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** tests getCostPerAd. **/
   @Test public void getCostPerAdTest() {
      IndirectMC mc2 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals("", 2.0, mc2.getCostPerAd(), .000001);
   }
      
   /** tests setCostPerAd. **/
   @Test public void setCostPerAdTest() {
      IndirectMC mc2 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      mc2.setCostPerAd(4.0);
      Assert.assertEquals("", 4.0, mc2.getCostPerAd(), .000001);
   }
      
      /** tests getNumberOfAds. **/
   @Test public void getNumberOfAds() {
      IndirectMC mc2 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals("", 3500, mc2.getNumberOfAds(), .000001);
   }
      
    /** tests setNumberOfAds. **/
   @Test public void setNumberOfAds() {
      IndirectMC test = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      test.setNumberOfAds(3500);
      Assert.assertEquals(test.getNumberOfAds(), 3500.0, 0.01);  
   }

       /** tests getBaseCost. **/
   @Test public void getBaseCostTest() {
      IndirectMC mc1 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals(mc1.getBaseCost(), 1500.0, 3.0);
   }
   /** tests campaignCost. **/
   @Test public void campaignCost() {
      IndirectMC test = new IndirectMC("Web Ads 1", 15000.00, 2.00, 3500);
      Assert.assertEquals("Cost is not equal", 8500.0, 
         test.campaignCost(), 1.00);  
   }
   /** tests toString. **/
   @Test public void toStringTest() {
      IndirectMC test = new IndirectMC("Web Ads 1", 15000.00, 2.00, 3500);
      Assert.assertTrue("", test.toString().contains("(class IndirectMC)"));
   
   }
}
