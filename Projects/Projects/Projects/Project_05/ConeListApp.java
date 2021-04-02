import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
* cone list app.
*
* @author Chase Hopkins - COMP-1213 - Project_05
* @version 2/18/21
*/

public class ConeListApp 
{
/**
* methods for cone list app.
* @param args (not used)
* @throws FileNotFoundException asdf
*/
   public static void main(String [] args)
      throws FileNotFoundException {
      ArrayList<Cone> myList = new ArrayList<Cone>();
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      System.out.println();
      Scanner scanFile = new Scanner(new File(fileName));
      String coneListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) 
      {
         String coneName = scanFile.nextLine();
         double baseEdge = Double.parseDouble(scanFile.nextLine());
         double height = Double.parseDouble(scanFile.nextLine());
         Cone c =
            new Cone(coneName, baseEdge, height);
         myList.add(c);
      }
      
      scanFile.close();
      ConeList myConeList =
         new ConeList(coneListName, myList);
      System.out.println(myConeList);
      System.out.println(myConeList.summaryInfo());
   }
}

