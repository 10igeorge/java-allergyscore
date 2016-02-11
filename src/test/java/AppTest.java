import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void allergyScore_returnsCatsIf128OrHigher_Cats(){
    App allergies = new App();
    assertEquals("cats", allergies.allergyScore(128));
  }

}


//
//
//
// HashMap allergies
// key : value
// key : value
// key : value
// key : value
// key : value
//
// while score > 0 {
//   for ( int value : allergies)
//
// }
//
// if (score >= 128) {
//   resultString += "cats";
//   score -= 128;
// } if (score >= 64) {
//   resultString += "pollen";
//   score -=64
// }
