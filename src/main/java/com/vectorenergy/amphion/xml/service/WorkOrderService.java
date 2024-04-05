package com.vectorenergy.amphion.xml.service;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.vectorenergy.amphion.xml.model.WorkOrderFinalizations;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Service
public class WorkOrderService {
    public WorkOrderFinalizations parseWOF(File xml) throws IOException {
        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(xml, WorkOrderFinalizations.class);
    }
}
