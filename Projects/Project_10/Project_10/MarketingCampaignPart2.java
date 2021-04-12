import java.io.FileNotFoundException;
/**
* This is the driver class that contains the main method to run all the
* Marketing Campaign related classes.
*
* @author Chase Hopkins - COMP-1213 - Project_10
* @version 4/7/21
*/
public class MarketingCampaignPart2 {
/**
* Main method that runs all Marketing Campaign classes and uses a file name
* as a Command Line Argument to create the MarketingCampaignList.
* @param args Command line arguments are used
* @throws FileNotFoundException just for you, WebCat. 
*/
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0)
      {
         System.out.println("File name expected as command line argument."
                           + "\nProgram ending.");
      }
      else
      {
         MarketingCampaignList myList = new MarketingCampaignList();
         myList.readFile(args[0]);
         System.out.print(myList.generateReport());
         System.out.println();
         System.out.println(myList.generateReportByName());
         System.out.println();
         System.out.println(myList.generateReportByCampaignCost());
         System.out.println();
         System.out.println(myList.generateReportByROI());
         System.out.println();
      }
   }
}