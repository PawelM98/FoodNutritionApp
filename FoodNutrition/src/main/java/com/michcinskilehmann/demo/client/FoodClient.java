package com.michcinskilehmann.demo.client;

import com.michcinskilehmann.demo.model.NutritionModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.stream.Stream;

@Service
public class FoodClient {

    public NutritionModel getNutritionModel(String calories,String period,String diet,String exclusion){

        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String,String> headers = new HttpHeaders();
        headers.set("x-rapidapi-key","49075a51fdmsh800e3e05d119bf6p16933bjsnb75c0ba929b5");
        headers.set("x-rapidapi-host","spoonacular-recipe-food-nutrition-v1.p.rapidapi.com");
        HttpEntity httpEntity = new HttpEntity(headers);

        ResponseEntity<NutritionModel> exchange = restTemplate.exchange("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/mealplans/generate?timeFrame="+period+"&targetCalories="+calories+"&diet="+diet+"&exclude="+exclusion+"",
                HttpMethod.GET,
                httpEntity,
                NutritionModel.class);

        Stream.of(exchange.getBody()).forEach(System.out::println);
        return exchange.getBody();
    }

}
