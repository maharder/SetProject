import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  // Implement the rest of this class yourself
  
  private int nextCardIndex;
  private ArrayList<Card>cards;
  private int i;
  private int j;
  private int k;
  private int l;
    
  public Deck(String filename) {
    cards = new ArrayList<Card>(81);
    
    try {
      String line;
      BufferedReader infile = new BufferedReader(new FileReader(filename));
      int position = 0;
  
      while((line = infile.readLine()) != null) {
        // Blank lines might contain white space, so trim it off
        line = line.trim();
        
        // ignore blank lines
        if(line.length() == 0)
          continue;
        
        // ignore comments
        if(line.startsWith("#"))
          continue;
            
        // a valid line contains 4 integers
        StringTokenizer tokenizer = new StringTokenizer(line);
        
        int quantity = Integer.parseInt(tokenizer.nextToken());
        int color = Integer.parseInt(tokenizer.nextToken());
        int shading = Integer.parseInt(tokenizer.nextToken());
        int shape = Integer.parseInt(tokenizer.nextToken());
        
        cards.add(new Card(quantity, color, shading, shape));
        nextCardIndex = 0;
      }
    }
    catch(Exception e) {
      throw new RuntimeException("Error while reading file: " + e.toString());
    }
  }
  
  public Deck(){
    cards = new ArrayList<Card>(81);
    
    for(i=1; i<4; i++){
      for(j=1; j<4; j++){
        for(k=1; k<4; k++){
          for(l=1; l<4; l++){
    Card a = new Card(i,j,k,l);
    cards.add(a);
    
          }
        }
      }
    }
    Collections.shuffle(cards);
  }
  
  public boolean hasNext(){
    if(nextCardIndex < cards.size()){
      return true;
    }
    else{
      return false;
    }
  }
  
  public Card getNext(){
    if(hasNext() == false){
      return null;
    }
    else{
      nextCardIndex += 1;
      return cards.get(nextCardIndex -1);
  }
 }
}
