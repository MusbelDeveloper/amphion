package com.vectorenergy.amphion.xml.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

public class StockConsumed {
    @JacksonXmlElementWrapper(localName = "stockdetails")
    public List<StockDetails> StockDetails;
}
