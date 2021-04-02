import java.text.DecimalFormat;
/**
* This program derived from Marketing Campaign. 
*
* @author Chase Hopkins - COMP-1213 - Project_09
* @version 4/2/21
*/
public class DirectMC extends MarketingCampaign {
     //-----------// 
    // variables //
   //-----------//
   private double costPerMailPiece;
   private int numberOfMailPieces;
   
   /**
   * base cost.
   */
   public static final double BASE_COST = 1000;   
     //-------------//
    // constructor //
   //-------------//
   /**
   * Constructor for DirectMC. 
   * @param nameIn - takes name. 
   * @param revenueIn - takes revenue.
   * @param costPerMailPieceIn - takes cost per mail piece.
   * @param numberOfMailPiecesIn - takes num of mail pieces. 
   */
   public DirectMC(String nameIn, double revenueIn, 
      double costPerMailPieceIn, int numberOfMailPiecesIn) {
      super(nameIn, revenueIn);
      
      costPerMailPiece = costPerMailPieceIn;
      numberOfMailPieces = numberOfMailPiecesIn;
   
   }
      //---------//
     // methods //
    //---------//  
    /**
    * Gets the cost per mail piece. 
    * @return - returns cost per piece
    */
   public double getCostPerMailPiece() {
      return costPerMailPiece;
   }
           
    /**
    * Sets the cost per mail piece.
    * @param costPerMailPieceIn - takes cost per mail piece. 
    */
   public void setCostPerMailPiece(double costPerMailPieceIn) {
      costPerMailPiece = costPerMailPieceIn;
   }
   /**
   * Gets the number of mail pieces.
   * @return - returns number of mail pieces. 
   */
   public int getNumberOfMailPieces() {
   
      return numberOfMailPieces;
   }
   
   /**
   * Sets the number of mail pieces.
   * @param numberOfMailPiecesIn - takes in number of 
   * mail pieces.
   */
   public void setNumberOfMailPieces(int numberOfMailPiecesIn) {
   
      numberOfMailPieces = numberOfMailPiecesIn;
   }
   
   /**
   * Calculates campaign cost.
   * @return - returns the campaign cost. 
   */
   public double campaignCost() {
      return (BASE_COST + (costPerMailPiece * numberOfMailPieces));
   }
   
   /**
   * String to String. 
   * @return - returns output.
   */
   public String toString() {
      DecimalFormat mv = new DecimalFormat("$#,##0.00");
      return super.toString() 
         + "\n   Base Cost: " + mv.format(BASE_COST) 
         + "\n   Mail Cost: "
         + mv.format((costPerMailPiece * numberOfMailPieces))
         + " = " + mv.format(getCostPerMailPiece())
         + " per mail piece" + " * " + getNumberOfMailPieces() 
         + " mail pieces";
   }
}
