package com.vectorenergy.amphion.controller;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.vectorenergy.amphion.mssql.repository.CabeceraPedidoClienteRepository;
import com.vectorenergy.amphion.xml.model.WorkOrderFinalizations;
import com.vectorenergy.amphion.xml.service.WorkOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class WorkOrder {

    private static final Logger log = LoggerFactory.getLogger(WorkOrder.class);
    @Autowired
    CabeceraPedidoClienteRepository cpc;
    @Autowired
    WorkOrderService woService;

    public void run() throws IOException {

        log.info(cpc.findAll().get(0).toString());
        File file = new File("\\\\192.168.40.8\\interface\\SGA\\Tratados\\WOF0120240322092440000.xml");
        log.info(file.getName());
        log.info(String.valueOf(woService.parseWOF(file).WorkOrderFinalization.get(0).WorCode));
    }

}
