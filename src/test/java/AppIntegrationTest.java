import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppIntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Enter a number between 1-255 and see what your allergies are");
  }
  @Test
  public void returnsAllergies() {
    goTo("http://localhost:4567");
    fill("#userScore").with("208");
    submit(".btn");
    assertThat(pageSource()).contains("cats, pollen, tomatoes");
  }
  @Test
  public void returnsError(){
    goTo("http://localhost:4567");
    fill("#userScore").with("2208");
    submit(".btn");
    assertThat(pageSource()).contains("Please enter a number between 1 and 255");
  }
}
