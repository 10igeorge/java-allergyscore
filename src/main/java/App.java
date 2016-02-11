import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import java.util.ArrayList;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/score", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/score.vtl");

      String userScore = request.queryParams("userScore");
      Integer integerUserScore = Integer.parseInt(userScore);
      String allergyScore = allergyScore(integerUserScore);

      model.put("allergies", allergyScore);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }


  public static String allergyScore(Integer score){
    ArrayList<String> totalAllergyArray = new ArrayList<String>();
    String totalAllergies = "";
    if(score < 0 || score >=256){
      return "Please enter a number between 1 and 255";
    }
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
    for (Integer i = 0; i < totalAllergyArray.size(); i++){
      if (i + 1 == totalAllergyArray.size()) {
        totalAllergies += totalAllergyArray.get(i);
      } else {
        totalAllergies = totalAllergies + totalAllergyArray.get(i) + ", ";
      }
    }
    return totalAllergies;
  }
}
