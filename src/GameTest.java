import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class GameTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testGame() {
    Game l = new Game();
    for(int i = 0; i < 1000; i++){
      l.playRound();
    }
    
    assertTrue(l.isGameOver());
    
    Game k = new Game();
    
    assertEquals(12,k.numCards());
    assertFalse(k.isGameOver());
    
    
  }
  
}
