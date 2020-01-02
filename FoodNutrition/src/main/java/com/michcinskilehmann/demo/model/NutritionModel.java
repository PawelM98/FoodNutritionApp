
package com.michcinskilehmann.demo.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meals",
    "nutrients"
})
public class NutritionModel {

    @JsonProperty("meals")
    private List<Meal> meals = null;
    @JsonProperty("nutrients")
    private Nutrients nutrients;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("meals")
    public List<Meal> getMeals() {
        return meals;
    }

    @JsonProperty("meals")
    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    @JsonProperty("nutrients")
    public Nutrients getNutrients() {
        return nutrients;
    }

    @JsonProperty("nutrients")
    public void setNutrients(Nutrients nutrients) {
        this.nutrients = nutrients;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "NutritionModel{" +
                "meals=" + meals +
                ", nutrients=" + nutrients +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
