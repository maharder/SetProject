public class Card {
    
  // Create the rest of this class yourself
  private int quantity;
  private int color;
  private int shading;
  private int shape;
  
  public Card( int quantity, int color, int shading, int shape){
    this.quantity = fixValue(quantity);
    this.color = fixValue(color);
    this.shading = fixValue(shading);
    this.shape = fixValue(shape);
    
  }
  
  private int fixValue(int valueToFix) {
    if (valueToFix < 1 || valueToFix > 3)
      return (((valueToFix % 3) + 3) % 3) +1;
    else
      return valueToFix;
  }
  
  public int getQuantity(){
    return quantity;
  }
  
  public int getColor(){
    return color;
  }
  
  public int getShading(){
    return shading;
  }
  
  public int getShape(){
    return shape;
  }
  
  public boolean isSet(Card c2, Card c3){
    if(((quantity + c2.getQuantity() + c3.getQuantity()) % 3 ==0) &&
       ((color + c2.getColor() + c3.getColor()) % 3 ==0) &&
       ((shading + c2.getShading() + c3.getShading()) % 3 ==0) &&
       ((shape + c2.getShape() + c3.getShape()) % 3 ==0)){
      return true;
    }
       else{
         return false;
       }
  }
  
  public String toString(){
    String s = "";
    if(quantity == 1){
      s += "1";
    }
    else if(quantity == 2){
      s += "2";
    }
    else if(quantity == 3){
      s += "3";
    }
    if(color == 1){
      s += "R";
    }
    else if(color == 2){
      s += "G";
    }
    else if(color == 3){
      s += "P";
    }
    if(shading == 1){
      s += "O";
    }
    else if(shading == 2){
      s += "T";
    }
    else if(shading == 3){
      s += "S";
    }
    if(shape == 1){
      s += "O";
    }
    else if(shape == 2){
      s += "D";
    }
    else if(shape == 3){
      s += "S";
    }
    return s;
  }
  
  public boolean equals(Object obj) {
    Card that = (Card)obj;
    
    return quantity == that.getQuantity() &&
      color == that.getColor() &&
      shading == that.getShading() &&
      shape == that.getShape();
  }
}
