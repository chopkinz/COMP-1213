import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* tests for DirectMC.
*
* @author Chase Hopkins - COMP-1213 - Project_09
* @version 4/2/21
*/
public class DirectMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** test getCostPerMailPiece. **/
   @Test public void getCostPerMailPieceTest() {
      DirectMC mc1 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals("", 3.00, mc1.getCostPerMailPiece(), .000001);
   }
   
   /** tests setCostPerMailPiece. **/
   @Test public void setCostPerMailPieceTest() {
      DirectMC mc1 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      mc1.setCostPerMailPiece(5.00);
      Assert.assertEquals("", 5.00, mc1.getCostPerMailPiece(), 00000.1);
   }
   
   
   /** tests getNumberOfMailPieces. **/
   @Test public void getNumberOfMailPiecesTest() {
      DirectMC mc1 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals("", 2000, mc1.getNumberOfMailPieces(), .000001);
   }
   
   /** tests setNumberOfMailPieces. **/
   @Test public void setNumberOfMailPiecesTest() {
      DirectMC mc1 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      mc1.setNumberOfMailPieces(4000);
      Assert.assertEquals("", 4000, mc1.getNumberOfMailPieces(), .000001); 
   }
   
   /** tests campaignCost. **/
   @Test public void campaignCostTest() {
      DirectMC mc1 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals("", 7000, mc1.campaignCost(), .000001);
   }
      
     /** tests toString. **/
   @Test public void toStringTest() {
      DirectMC mc1 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertTrue("", mc1.toString().contains("(class DirectMC)"));   
   }

}
