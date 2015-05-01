public class Main
{
  public static void main (String[] args)
  {
    double theSets = 0;
    for (int i = 0; i < 10000; i++)
    {
      Game a = new Game();
      theSets += a.numSets();
    }
    System.out.println("Average number of sets in 12 cards from the deck: " + theSets/10000);
    
    double cardsLeft = 0;
    for (int i = 0; i < 10000; i++)
    {
      Game a = new Game();
      while(!a.isGameOver())
      {
        a.playRound();
      }
      cardsLeft += a.numCards();
    }
    System.out.println("Average number of cards when the game is over: " + cardsLeft/10000);
  }
}
