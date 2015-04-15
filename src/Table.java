public class Table{
  private TableNode head;
  private int numCards;
  
  public Table(){
    
  }
  public void add(Card c){
    TableNode newNode = new TableNode(c);
    if(head == null){
      head = newNode;
    }
    else{
      newNode.setNext(head);
      head=newNode;
  }
    numCards++;
 }
    private boolean onTable(Card c){
      TableNode curr = head;
      while(curr != null){
        Card currCard = curr.getCard();
        if(currCard.equals(c)){
          return true;
        }
        curr=curr.getNext();
    }
      return false;
  }
       private void removeCard(Card c){ 
        TableNode prev = findPrev(c);
        if(prev== null){
          head = head.getNext();
        }
        else{
          TableNode curr = prev.getNext();
          prev.setNext(curr.getNext());
          prev = findPrev(c);
        }
        numCards--;
      }
       private TableNode findPrev(Card c){
         TableNode prev = null;
         TableNode curr = head;
         while(curr != null){
           Card currCard = curr.getCard();
           if(currCard.equals(c)){
             return prev;
           }
           prev = curr; 
           curr = curr.getNext();
         }
         return null;
       }
  public void removeSet(Card c1, Card c2, Card c3){
    //if(c1.isSet(c2,c3) && this.onTable(c1) && this.onTable(c2) && this.onTable(c3)){
    if(! c1.isSet(c2,c3))
      return;
    if(! onTable(c1))
      return;
    if(! onTable(c2))
      return;
    if(! onTable(c3))
      return;
    removeCard(c1);
    removeCard(c2);
    removeCard(c3);
    //}
  }
  public int numCards(){
    return numCards;
  }
  public Card getCard(int in){
    TableNode curr = head;
    int x = 0;
    if(in > (this.numCards() - 1) || in <0)
      return null;
    while(curr.getNext() != null && x != in){
      x++;
      curr = curr.getNext();
    }
    return curr.getCard();
  }
  public int numSets(){
    int numSets = 0;
    for (int a = 0; a < numCards(); a++)
    {
      for (int b = a + 1; b < numCards(); b++)
      {
        for (int c = b + 1; c < numCards(); c++)
        {
          if (getCard(a).isSet(getCard(b),getCard(c)))
          {
            numSets ++;
          }
        }
      }
    }
    return numSets;
  }
}