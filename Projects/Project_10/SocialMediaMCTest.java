import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* tests for SocialMediaMC.
*
* @author Chase Hopkins - COMP-1213 - Project_09
* @version 4/2/21
*/
public class SocialMediaMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** A test to test the getNumber of ads. **/
   @Test public void getBaseCostTest() {
      SocialMediaMC mc1 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      Assert.assertEquals(mc1.getBaseCost(), 3000.0, 1.0);
   
   }
}
