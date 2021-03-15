/**
* main class for Activity_04. runs methods from UserInfo.java.
* @author Chase Hopkins - COMP-1213 - Activity_04
* @version 2/9/2021
*
*/
public class UserInfoDriver {
  
   /**
   * @param args not used
   */
   
   public static void main(String[] args) {
      
      // user1
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      // user2 
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}