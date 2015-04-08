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
    for(int i = 0; i < 81; i++)
    {
      Card b = a.getNext();
    }
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
}
