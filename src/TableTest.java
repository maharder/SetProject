import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class TableTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testTable() {
    Table newT = new Table();
    
    assertEquals(0,newT.numSets());
    assertEquals(0,newT.numCards());
    
    Deck a = new Deck();
    Table b = new Table();
    for (int i = 0; i < 12; i++)
    {
      b.add(a.getNext());
    }

    assertEquals(12,b.numCards());
  }
  
}
