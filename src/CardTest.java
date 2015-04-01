import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class CardTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testCard() {
  
    Card c1 = new Card(1, 1, 1, 1);
    assertEquals(1, c1.getQuantity());
    assertEquals(1, c1.getColor());
    assertEquals(1, c1.getShading());
    assertEquals(1, c1.getShape());
    assertEquals("1ROO",c1.toString());
    
    Card c2 = new Card (2,2,2,2);
    assertEquals(2, c2.getQuantity());
    assertEquals(2, c2.getColor());
    assertEquals(2, c2.getShading());
    assertEquals(2, c2.getShape());
    assertEquals("2GTD",c2.toString());
    
    Card c3 = new Card (3,3,3,3);
    assertEquals(3, c3.getQuantity());
    assertEquals(3, c3.getColor());
    assertEquals(3, c3.getShading());
    assertEquals(3, c3.getShape());
    assertEquals("3PSS",c3.toString());
    
    Card c4 = new Card (-10,-22,-16,11);
    assertEquals(3, c4.getQuantity());
    assertEquals(3, c4.getColor());
    assertEquals(3, c4.getShading());
    assertEquals(3, c4.getShape());
    assertEquals("3PSS", c4.toString());
    
    assertFalse(c1.isSet(c3,c4));
    assertTrue(c1.isSet(c2,c3));
    
    Card c5 = new Card (7,7,7,7);
    assertFalse(c1.equals(c2));
    assertTrue(c2.equals(c5));
    
    Card c6 = new Card (1,2,3,1);
    assertEquals(1, c6.getQuantity());
    assertEquals(2, c6.getColor());
    assertEquals(3, c6.getShading());
    assertEquals(1, c6.getShape());
    assertEquals("1GSO", c6.toString());
    
    assertFalse(c1.isSet(c4, c6));
  }
}
