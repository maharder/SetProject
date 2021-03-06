public class Game{
  
  private Table t = new Table();
  private Deck d;
  
  public Game(){
    d = new Deck();
    int i = 0;
    while (d.hasNext() && i != 12){
      t.add(d.getNext());
      i++;
    }
  }
  
  public Game(String filename){
    d = new Deck(filename);
    int i = 0;
    while (d.hasNext() && i != 12){
      t.add(d.getNext());
      i++;
    }
  }
  
  public int numSets(){
    return t.numSets();
  }
  
  public int numCards(){
    return t.numCards();
  }
  
  public void playRound(){
    int n = 0;
    
    if (n == 0 && t.numSets() == 0 && d.hasNext()){
      int i = 0;
      while (d.hasNext() & i != 3){
        t.add(d.getNext());
        i++;
      }
      
      n ++;
    }
    
    if (n == 0 && t.numSets() != 0 && d.hasNext() && t.numCards() == 12){
      int count = 0;
      for (int i = 0; i < t.numCards(); i++){
        for (int j = i + 1; j < t.numCards(); j++){
          for (int k = j + 1; k < t.numCards() && count == 0; k++){
            if (t.getCard(i).isSet(t.getCard(j),t.getCard(k))){
              t.removeSet(t.getCard(i), t.getCard(j), t.getCard(k));
              count ++;
            }
          }
        }
      }
      
      int i = 0;
      while (d.hasNext() & i != 3){
        t.add(d.getNext());
        i++;
      }
      
      n++;
    }
    
    if (n == 0 && t.numCards() > 12 && t.numSets() != 0){
      int count = 0;
      for (int i = 0; i < t.numCards(); i++){
        for (int j = i + 1; j < t.numCards(); j++){
          for (int k = j + 1; k < t.numCards() && count == 0; k++){
            if (t.getCard(i).isSet(t.getCard(j),t.getCard(k))){
              t.removeSet(t.getCard(i), t.getCard(j), t.getCard(k));
              count ++;
            }
          }
        }
      }
      
      n ++;
    }
    
    if (n == 0 && t.numSets() != 0 && !d.hasNext()){
      int count = 0;
      for (int i = 0; i < t.numCards(); i++){
        for (int j = i + 1; j < t.numCards(); j++){
          for (int k = j + 1; k < t.numCards() && count == 0; k++){
            if (t.getCard(i).isSet(t.getCard(j),t.getCard(k))){
              t.removeSet(t.getCard(i), t.getCard(j), t.getCard(k));
              count ++;
            }
          }
        }
      }
      
      n ++;
    }
  }
  
  public boolean isGameOver(){
    if(t.numSets() == 0 && !d.hasNext())
      return true;
    else
      return false;
  }
}