/**
* Invalid Category Exception class.
*
* @author Chase Hopkins - COMP-1213 - Project_11
* @version 4/12/21
*/
public class InvalidCategoryException extends Exception
{

/**
* This method is the constructor for the exception.
* @param categoryIn is the categoryIn of the entry.
*/
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}