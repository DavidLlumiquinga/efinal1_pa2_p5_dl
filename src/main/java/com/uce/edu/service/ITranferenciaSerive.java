package com.uce.edu.service;

import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Transferencia;

public interface ITranferenciaSerive {
	public Transferencia buscar(String id);
	public void guardar(Transferencia transferencia);
	public void realizarTransferencia(CuentaBancaria bancaria1, CuentaBancaria bancaria2);
}
