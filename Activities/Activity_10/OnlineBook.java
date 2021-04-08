/**
* Online book program for Activity_09.
* 
* @author Chase Hopkins - COMP-1213 - Activity_09
* @version 3/30/21
*/
public class OnlineBook extends OnlineTextItem {
   protected String author;
/**
* constructor.
* @param nameIn input for the name
* @param priceIn input for price.
*/
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   
   }
   /**
   * to string.
   * @return to string
   */
   public String toString() {
      return name + " - " + author + ": $" + price;
   
   }
   /**
   * set author.
   * @param authorIn input for the author.
   */
   public void setAuthor(String authorIn) {
      author = authorIn;
   
   }

}