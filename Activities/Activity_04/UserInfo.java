/** 
* 
* @author Chase Hopkins - COMP-1213 - Activity_04
* @version 2/9/2021
*
*/

public class UserInfo {
   
   // instance variables 
   private String firstName; 
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   // constructor 
   /**
   *
   * @param firstNameIn for first name.
   * @param lastNameIn for last name. 
   */
   
   public UserInfo(String firstNameIn, String lastNameIn) {
      
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not Specified";
      age = 0;
      status = OFFLINE;
   }
   
   // methods 
   
   /**
   * Prints name, location, and status. 
   * @return string 
   */
   
   public String toString() {
      String output = "Name: " + firstName + " "
            + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      } else {
         output += "Online";
      }
      return output;
   }

/**
* Sets user location.
* @param locationIn takes input from user for the location 
*/

   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
   * @param ageIn takes input from user for age
   * @return returns ariable age and isSet
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
      * @return returns age.
      */
   public int getAge() {
      return age;
   }
      /**
      * @return returns location.
      */
   public String getLocation() {
      return location;
   }
      /**
      */
   public void logOff() {
      status = OFFLINE;
   }
      /**
      */
   public void logOn() {
      status = ONLINE;
   }
}
   
   
      
