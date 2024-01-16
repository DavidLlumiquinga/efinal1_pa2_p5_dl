package com.uce.edu.repository;

import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Transferencia;

public interface ITransferenciaRepository {

	public Transferencia seleccionar(String id);
	public void insertar(Transferencia transferencia);
	public void realizarTransferencia(CuentaBancaria bancaria1, CuentaBancaria bancaria2);
	
}
