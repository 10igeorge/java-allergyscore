import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void allergyScore_returnsCatsIf128OrHigher_Cats(){
    App allergies = new App();
    assertEquals("cats", allergies.allergyScore(128));
  }
  @Test
  public void allergyScore_returnsPollenIf64OrHigher_Pollen(){
    App allergies = new App();
    assertEquals("pollen", allergies.allergyScore(64));
  }
  @Test
  public void allergyScore_returnsChocolateIf32OrHigher_Chocolate(){
    App allergies = new App();
    assertEquals("chocolate", allergies.allergyScore(32));
  }
  @Test
  public void allergyScore_returnsTomatoesIf16OrHigher_Tomatoes(){
    App allergies = new App();
    assertEquals("tomatoes", allergies.allergyScore(16));
  }
  @Test
  public void allergyScore_returnsStrawberriesIf8OrHigher_Strawberries(){
    App allergies = new App();
    assertEquals("strawberries", allergies.allergyScore(8));
  }
  @Test
  public void allergyScore_returnsShellfishIf4OrHigher_Shellfish(){
    App allergies = new App();
    assertEquals("shellfish", allergies.allergyScore(4));
  }
  @Test
  public void allergyScore_returnsPeanutsIf2OrHigher_Peanuts(){
    App allergies = new App();
    assertEquals("peanuts", allergies.allergyScore(2));
  }
  @Test
  public void allergyScore_returnsEggsIf1OrHigher_Eggs(){
    App allergies = new App();
    assertEquals("eggs", allergies.allergyScore(1));
  }



}
