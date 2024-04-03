package com.vectorenergy.amphion.mssql.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Table(name="Cabecerapedidocliente")
@AllArgsConstructor
@NoArgsConstructor
public class CabeceraPedidoCliente implements Serializable {
    @EmbeddedId
    private CabeceraPedidoClienteIdentity cabeceraPedidoClienteIdentity;
    @Column(name="Codigocliente")
    private String numeroCliente;


}
