package com.uce.edu.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//@Entity
@Table(name = "transferencia")
public class Transferencia {

	private Integer id;
	private LocalDateTime fechaTransferencia;
	private CuentaBancaria cuentaBancaria1;
	private CuentaBancaria cuentaBancaria2;
	private BigDecimal monto;
	private BigDecimal comision;
	
	
	private Propietario propietario;
	
	private CuentaBancaria cuentaBancaria;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}
	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}
	public CuentaBancaria getCuentaBancaria1() {
		return cuentaBancaria1;
	}
	public void setCuentaBancaria1(CuentaBancaria cuentaBancaria1) {
		this.cuentaBancaria1 = cuentaBancaria1;
	}
	public CuentaBancaria getCuentaBancaria2() {
		return cuentaBancaria2;
	}
	public void setCuentaBancaria2(CuentaBancaria cuentaBancaria2) {
		this.cuentaBancaria2 = cuentaBancaria2;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public BigDecimal getComision() {
		return comision;
	}
	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}
	
	
	
}
