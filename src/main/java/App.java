import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import java.util.ArrayList;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
  }


  public static String allergyScore(Integer score){
    ArrayList<String> totalAllergyArray = new ArrayList<String>();
    String totalAllergies = "";
    if (score >= 128){
      totalAllergyArray.add("cats");
      score -=128;
    }
    for (String key : totalAllergyArray){
      totalAllergies += key;
    }
    return totalAllergies;
  }
}
