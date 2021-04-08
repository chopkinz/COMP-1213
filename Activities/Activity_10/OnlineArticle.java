/**
* Online article program for Activity_09.
* 
* @author Chase Hopkins - COMP-1213 - Activity_09
* @version 3/30/21
*/
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
/**
* constructor.
*
* @param nameIn input for the name.
* @param priceIn input for the price.
*/
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   /**
   * sets the word count.
   *
   * @param wordCountIn input for word the word count.
   */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
   

}