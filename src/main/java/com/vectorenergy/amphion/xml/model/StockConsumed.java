package com.vectorenergy.amphion.xml.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class StockConsumed {
    @JsonProperty("StockDetails")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<StockDetails> StockDetails;
}
