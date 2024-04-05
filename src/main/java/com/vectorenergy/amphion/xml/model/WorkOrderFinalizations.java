package com.vectorenergy.amphion.xml.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkOrderFinalizations {
    @JacksonXmlElementWrapper(useWrapping=false)
    @JsonProperty("WorkOrderFinalization")
    public List<WorkOrderFinalization> WorkOrderFinalization;
}
