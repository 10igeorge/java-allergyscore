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
    if (score >= 64){
      totalAllergyArray.add("pollen");
      score -=64;
    }
    if (score >= 32){
      totalAllergyArray.add("chocolate");
      score -=32;
    }
    if (score >= 16){
      totalAllergyArray.add("tomatoes");
      score -=16;
    }
    if (score >= 8){
      totalAllergyArray.add("strawberries");
      score -=8;
    }
    if (score >= 4){
      totalAllergyArray.add("shellfish");
      score -=4;
    }
    if (score >= 2){
      totalAllergyArray.add("peanuts");
      score -=2;
    }
    if (score >= 1){
      totalAllergyArray.add("eggs");
      score -=1;
    }
    for (String key : totalAllergyArray){
      totalAllergies += key;
    }
    return totalAllergies;
  }
}
