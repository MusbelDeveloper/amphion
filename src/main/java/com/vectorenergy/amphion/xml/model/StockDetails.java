package com.vectorenergy.amphion.xml.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockDetails {
    @JsonProperty("ItemCode")
    public String ItemCode;
    @JsonProperty("OwnerCode")
    public String OwnerCode;
    @JsonProperty("Quantity")
    public int Quantity;
    @JsonProperty("QtyUoMCode")
    public String QtyUoMCode;
    @JsonProperty("Location")
    public String Location;
    @JsonProperty("Container")
    public Object Container;
    @JsonProperty("StockAttributes")
    public StockAttributes StockAttributes;
    @JsonProperty("StockCustomAttributes")
    public Object StockCustomAttributes;
}
