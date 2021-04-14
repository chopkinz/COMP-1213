import java.io.FileNotFoundException;
/**
* Creates an array of MarketingCampaign objects and reads in
* a data file to egenerate reports. 
* @author Chase Hopkins - COMP1213 - Project_11
* @version 4/12/21
*/
public class MarketingCampaignPart3 {
/**
* Main method for PetBoardingList.
* @param args Command Line 
* @throws FileNotFoundException reads incorrect category
*/
   public static void main(String[] args) throws FileNotFoundException {
      try {
         if (args.length > 0) {
            String fileName = args[0];
            MarketingCampaignList myList = new MarketingCampaignList();
            myList.readFile(fileName);
            System.out.print(myList.generateReport());
            System.out.println();
            System.out.println(myList.generateReportByName());
            System.out.println();
            System.out.println(myList.generateReportByCampaignCost());
            System.out.println();
            System.out.println(myList.generateReportByROI());
            System.out.println();
            System.out.println(myList.generateInvalidRecordsReport());
            System.out.println();
            
         }
         else {
            System.out.println("File name expected as "
               + "command line argument.\nProgram ending.");
         }
      }
      catch (FileNotFoundException exception) {
         String fileName = args[0];
         System.out.println("*** Attempted to read file: " + fileName
            + " (No such file or directory)");
      }
       
   }
}
