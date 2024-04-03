package com.vectorenergy.amphion.controller;

import com.vectorenergy.amphion.mssql.entity.CabeceraPedidoClienteIdentity;
import com.vectorenergy.amphion.mssql.repository.CabeceraPedidoClienteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WorkOrder {

    private static final Logger log = LoggerFactory.getLogger(WorkOrder.class);
    @Autowired
    CabeceraPedidoClienteRepository cpc;
    public void run(){
        log.info("prueba");
        System.out.printf(cpc.findAll().get(0).toString());
    }

}
