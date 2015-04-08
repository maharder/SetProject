import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class DeckTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testFullDeck() {
    Deck a = new Deck();
    int qSum = 0;
    int cSum = 0;
    int tSum = 0;
    int sSum = 0;
    for(int i = 0; i < 81; i++)
    {
      Card b = a.getNext();
      qSum += b.getQuantity();
      cSum += b.getColor();
      tSum += b.getShading();
      sSum += b.getShape();
      
    }
    assertEquals(162 , qSum);
    assertEquals(162 , cSum);
    assertEquals(162 , tSum);
    assertEquals(162 , sSum);
    assertFalse(a.hasNext());
  }
  
  public void testDeckFromFile()
  {
    Deck a = new Deck("someCards.dat");
    for(int i=0; i < 7; i++){
      Card b = a.getNext();
    }
    assertFalse(a.hasNext());
  }
  public void testSet(){
    Deck setCards = new Deck("someCards.dat");
    Card c1 = setCards.getNext();
    Card c2 = setCards.getNext();
    Card c3 = setCards.getNext();
    assertTrue(c1.isSet(c2,c3));
  }
}
