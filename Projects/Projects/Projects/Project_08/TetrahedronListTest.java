import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* This program tests the methods of TetrahedronList.
*
* @author Chase Hopkins - COMP-1213 - Project_08
* @version 3/26/21
*/
public class TetrahedronListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Tests getName method. **/
   @Test public void getNameList() {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
         
      TetrahedronList ttList = new TetrahedronList("test list", t, 3);
         
      Assert.assertEquals("getName List",
         "test list", ttList.getName());
   }
   
    /**
    * List for numberOfTetrahedrons.
    */
   @Test public void numberOfTetrahedrons()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
         
      TetrahedronList ttList = new TetrahedronList("test list", t, 3);
         
      Assert.assertEquals("numberOfTetrahedrons List",
         3, ttList.numberOfTetrahedrons(), .0001);
   }
   
    /**
    * Tests for totalSurfaceArea.
    */
   @Test public void totalSurfaceArea()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
         
      TetrahedronList ttList = new TetrahedronList("test list", t, 3);
         
      Assert.assertEquals("totalSurfaceArea Test", 
         5.1961, ttList.totalSurfaceArea(), .0001);
   }
   
    /**
    * Test for averageSurfaceArea.
    */
   @Test public void averageSurfaceArea()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
         
      TetrahedronList ttList = new TetrahedronList("test list", t, 3);
      Assert.assertEquals("averageSurfaceArea Test",
         1.7320, ttList.averageSurfaceArea(), .0001);
                              
      TetrahedronList ttList2 = new 
            TetrahedronList("test list", null, 0);
      Assert.assertEquals("averageSurfaceArea Test2",
         0, ttList2.averageSurfaceArea(), .0001);
   }
   
    /**
    * Tests for totalVolume.
    */
   @Test public void totalVolume()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
         
      TetrahedronList ttList = new TetrahedronList("test list", t, 3);
         
      Assert.assertEquals("totalVolume Test", 
         0.3535, ttList.totalVolume(), .0001);
   }
   
    /**
    * Tests for averageVolume.
    */
   @Test public void averageVolume()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
         
      TetrahedronList ttList = new TetrahedronList("test list", t, 3);
      Assert.assertEquals("averageVolume Test",
         0.1178, ttList.averageVolume(), .0001);
                              
      TetrahedronList ttList2 = new 
         TetrahedronList("test list", null, 0);
      Assert.assertEquals("averageVolume Test2",
         0, ttList2.averageVolume(), .0001);
   }
   
    /**
    * Tests for toString.
    */
   @Test public void toStringTest()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
         
      TetrahedronList ttList = new TetrahedronList("test list", t, 3);
      
      Assert.assertEquals("toString test", false, 
         ttList.toString().contains("Tetrahedron \"test\""
            + " with radius 1.0"));
   }
   
    /**
    * Tests for getList.
    */
   @Test public void getList()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
         
      TetrahedronList ttList = new TetrahedronList("test list", t, 3);
         
      Assert.assertArrayEquals("getList Test",
         t, ttList.getList());
   }
      
    /**
    * Tests for addTetrahedron.
    */
   @Test public void addTetrahedron()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 8.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 7.0);
         
      TetrahedronList ttList = new TetrahedronList("test list", t, 3);
         
      Tetrahedron t2 = new Tetrahedron("test4", 1.0);
      ttList.addTetrahedron("test4", 1.0);
      Tetrahedron[] tA = ttList.getList();
         
      Assert.assertEquals("addTetrahedron Test",
         t2, tA[3]);
   }
   
    /**
    * Test for deleteTetrahedron.
    */
   @Test public void deleteTetrahedron()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
         
      TetrahedronList ttList = new TetrahedronList("test list", t, 3);
         
      Tetrahedron t2 = new Tetrahedron("test4", 1.0);
      Tetrahedron t3 = new Tetrahedron("test", 1.0);
      ttList.addTetrahedron("test4", 1.0);
      Tetrahedron[] tA = ttList.getList();
         
      Assert.assertEquals("pre deleteTetrahedron Test",
         t2, tA[3]);         
      
      Assert.assertEquals("deleteTetrahedron true Test",
         t3, ttList.deleteTetrahedron("test"));
      
      Assert.assertEquals("deleteTetrahedron true Test",
         t2, tA[2]);
      
      Assert.assertEquals("deleteTetrahedron false Test",
         null, ttList.deleteTetrahedron("false"));
   }
      
    /**
    * Test for findTetrahedron.
    */
   @Test public void findTetrahedron()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 3.0);
      t[2] = new Tetrahedron("test3", 5.0);
         
      TetrahedronList ttList = new TetrahedronList("test list", t, 3);
      Tetrahedron t2 = new Tetrahedron("test", 1.0);
         
      Assert.assertEquals("findTetrahedron true Test",
         t2, ttList.findTetrahedron("test"));
                              
      Assert.assertEquals("findTetrahedron false Test",
         null, ttList.findTetrahedron("false"));
      
   }
      
    /**
    * Test for editTetrahedron.
    */
   @Test public void editTetrahedron()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 8.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 7.0);
         
      TetrahedronList ttList = new TetrahedronList("test list", t, 3);
      Tetrahedron t2 = new Tetrahedron("test", 8.0);
      Tetrahedron t3 = new Tetrahedron("test", 9.0);
      Tetrahedron[] tA = ttList.getList();
         
      Assert.assertEquals("pre editTetrahedron Test",
         t2, tA[0]);
      Assert.assertEquals("editTetrahedron true Test",
         true, ttList.editTetrahedron("test", 9.0));
      Assert.assertEquals("editTetrahedron true Test",
         t3, tA[0]);
      Assert.assertEquals("findTetrahedron false Test",
         false, ttList.editTetrahedron("false", 9.0));
   }
   
    /**
    * Test for findTetrahedronWithLargestVolume.
    */
   @Test public void findTetrahedronWithLargestVolume()
   {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 3.0);
      t[2] = new Tetrahedron("test3", 5.0);
         
      Tetrahedron t2 = new Tetrahedron("test", 1.0);
      Tetrahedron t3 = new Tetrahedron("test2", 3.0);
      Tetrahedron t4 = new Tetrahedron("test3", 5.0);
         
      TetrahedronList ttList = new TetrahedronList("test list", t, 3);
      Assert.assertEquals("findTetrahedronWithLargestVolumeTrueTest",
            t4, ttList.findTetrahedronWithLargestVolume());
                              
      TetrahedronList ttList2 = new 
         TetrahedronList("test list", null, 0);
      Assert.assertEquals("findTetrahedronWithLargestVolumeFalseTest",
            null, ttList2.findTetrahedronWithLargestVolume());
   }
   
   
}
