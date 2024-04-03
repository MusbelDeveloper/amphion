package com.vectorenergy.amphion.mssql.repository;

import com.vectorenergy.amphion.mssql.entity.CabeceraPedidoCliente;
import com.vectorenergy.amphion.mssql.entity.CabeceraPedidoClienteIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabeceraPedidoClienteRepository  extends JpaRepository<CabeceraPedidoCliente, CabeceraPedidoClienteIdentity> {
}
