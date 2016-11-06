
import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class CardTest {

  Card twoOfClubs;

  @Before
  public void before(){
    twoOfClubs = new Card(2, Suit.CLUBS);
  }

  @Test
  public void hasNumber(){
    assertEquals(2, twoOfClubs.getNumber());
  }

  @Test
  public void hasSuit(){
    assertEquals(Suit.CLUBS, twoOfClubs.getSuit());
  }

  @Test(expected=IllegalArgumentException.class)
  public void numberNotBelowOne(){
    Card card = new Card(0, Suit.SPADES);
  }

  @Test(expected=IllegalArgumentException.class)
  public void numberNotAbove13(){
    Card card = new Card(14, Suit.SPADES);
  }

  @Test
  public void canPrintString(){
    Card aceOfSpades = new Card(1, Suit.SPADES);
    Card kingOfClubs = new Card(13, Suit.CLUBS);
    assertEquals("Ace of SPADES", aceOfSpades.toString());
    assertEquals("King of CLUBS", kingOfClubs.toString());
  }

}