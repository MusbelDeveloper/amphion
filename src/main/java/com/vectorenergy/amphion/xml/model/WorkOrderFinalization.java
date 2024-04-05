package com.vectorenergy.amphion.xml.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkOrderFinalization {

    @JsonProperty("Site")
    public String Site;
    @JsonProperty("WorCode")
    public String WorCode;
    @JsonProperty("Status")
    public String Status;
    @JsonProperty("WorType")
    public String WorType;
    @JsonProperty("WorkLocationCode")
    public String WorkLocationCode;
    @JsonProperty("ItemCode")
    public String ItemCode;
    @JsonProperty("OwnerCode")
    public String OwnerCode;
    @JsonProperty("KitItemVersion")
    public int KitItemVersion;
    @JsonProperty("Quantity")
    public int Quantity;
    @JsonProperty("QuantityProc")
    public int QuantityProc;
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("StockConsumed")
    public StockConsumed StockConsumed;
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("StockCreated")
    public StockCreated StockCreated;
    @JsonProperty("CustomAttributes")
    public Object CustomAttributes;
}
