import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Tetrahedron test.
* @author Chase Hopkins - COMP1210 - Project_07A
* @version 3/11/21
*/

public class TetrahedronTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
   * label test.
   */
   @Test public void labelTest() {
      Tetrahedron test = new Tetrahedron("test", 1);
      test.setLabel("example");
      Assert.assertEquals("Label is not equal", "example", test.getLabel());
   }
   
   /**
   * tests edge.
   */
   @Test public void edgeTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      test.setEdge(2.0);
      Assert.assertEquals(2.0, test.getEdge(), 0.0001);
   }
   
   /** 
   * tests height. 
   */
   @Test public void heightTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      Assert.assertEquals("Height is not equal", 0.816, test.height(), 1);
   }
   
   /**
   * surface area test. 
   */
   @Test public void surfaceAreaTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      Assert.assertEquals("Surface area is incorrect", 1.732,
         test.surfaceArea(), 1);
   }
   
   /**
   * volume test. 
   */
   @Test public void volumeTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      Assert.assertEquals("Volume is incorrect", 0.118, test.volume(), 1);
   }
   
   /** Tests the toString method of Tetrahedron.
   */
   @Test public void toStringTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      String toStringTest = "Tetrahedron \"test\" with six edges of ";
      toStringTest += "length 1.0 has:\n\theight = 0.816 units";
      toStringTest += "\n\tsurface area = 1.732 square units";
      toStringTest += "\n\tvolume = 0.118 cubic units";
      Assert.assertEquals(toStringTest, test.toString());
   }
   
   /** Tests the getCount and resetCont methods.
   */
   @Test public void countTest() {
      Tetrahedron.resetCount();
      Assert.assertEquals("Count is not zero", 0, Tetrahedron.getCount());
      Tetrahedron test0 = new Tetrahedron("test0", 1.0);
      Tetrahedron test1 = new Tetrahedron("test1", 2.0);
      Tetrahedron test2 = new Tetrahedron("test2", 3.0);
      Assert.assertEquals("Count does not reflect number of created" 
         + " tetrahedrons", 3, Tetrahedron.getCount());
   }
   
   /**
   * tests outcome equal method. 
   */
   @Test public void equalsTrueTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      Tetrahedron object = new Tetrahedron("test", 1.0);
      Assert.assertTrue("Object is not equal", test.equals(object));
   }
   /**
   * tests instance of equals method. 
   */
   @Test public void equalObjFalseTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      String object = "test";
      Assert.assertFalse("equals() does not differentiate objects",
         test.equals(object));
   }
    
    /** tests the parameter comparison of the euals method. 
    */
   @Test public void equalsTetrahedronFalseTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      Tetrahedron labelIn = new Tetrahedron("test1", 1.0);
      Assert.assertFalse("label failure", test.equals(labelIn));
      Tetrahedron edgeIn = new Tetrahedron("test", 1.1);
      Assert.assertFalse("edge failure", test.equals(edgeIn));
   }
      
      /**
      * tests the hashcode method. 
      */
   @Test public void hashCodeTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      Assert.assertEquals("hashcode", 0, test.hashCode());
   }
}

