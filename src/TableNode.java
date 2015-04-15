public class TableNode{
  private Card newCard;
  private TableNode next;
  
  public TableNode(Card card){
    newCard = card;
  }
  public void setNext(TableNode newNext){
    next = newNext;
  }
  public TableNode getNext(){
    return next;
  }
  public Card getCard(){
    return newCard;
  }
}