import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* tests for SearchEngineMC.
*
* @author Chase Hopkins - COMP-1213 - Project_09
* @version 4/2/21
*/
public class SearchEngineMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** tests getBaseCost. **/
   @Test public void getBaseCostTest() {
      SearchEngineMC mc1 = new SearchEngineMC("Web Ads 2", 
         27500.00, 2.50, 5000);
      Assert.assertEquals(mc1.getBaseCost(), 2000.0, 1.0);
   }
}
