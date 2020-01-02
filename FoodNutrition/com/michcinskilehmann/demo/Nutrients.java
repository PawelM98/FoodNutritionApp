
package com.michcinskilehmann.demo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "calories",
    "protein",
    "fat",
    "carbohydrates"
})
public class Nutrients {

    @JsonProperty("calories")
    private Double calories;
    @JsonProperty("protein")
    private Double protein;
    @JsonProperty("fat")
    private Double fat;
    @JsonProperty("carbohydrates")
    private Double carbohydrates;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("calories")
    public Double getCalories() {
        return calories;
    }

    @JsonProperty("calories")
    public void setCalories(Double calories) {
        this.calories = calories;
    }

    @JsonProperty("protein")
    public Double getProtein() {
        return protein;
    }

    @JsonProperty("protein")
    public void setProtein(Double protein) {
        this.protein = protein;
    }

    @JsonProperty("fat")
    public Double getFat() {
        return fat;
    }

    @JsonProperty("fat")
    public void setFat(Double fat) {
        this.fat = fat;
    }

    @JsonProperty("carbohydrates")
    public Double getCarbohydrates() {
        return carbohydrates;
    }

    @JsonProperty("carbohydrates")
    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
