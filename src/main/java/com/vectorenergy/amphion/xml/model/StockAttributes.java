package com.vectorenergy.amphion.xml.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StockAttributes {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty("StockAttSN")
    public String StockAttSN;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty("StockAttWeight")
    public int StockAttWeight;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty("StockAttVersion")
    public int StockAttVersion;
}
