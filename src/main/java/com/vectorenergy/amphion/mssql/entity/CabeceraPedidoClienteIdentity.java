package com.vectorenergy.amphion.mssql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable

public class CabeceraPedidoClienteIdentity implements Serializable {
    @Column(name = "Ejerciciopedido", nullable = false)
    private int ejercicioPedido;
    @Column(name = "Numeropedido", nullable = false)
    private int numeroPedido;
    @Column(name = "Seriepedido", nullable = false)
    private String seriePedido;
    @Column(name = "Codigoempresa", nullable = false)
    private int codigoEmpresa;

}