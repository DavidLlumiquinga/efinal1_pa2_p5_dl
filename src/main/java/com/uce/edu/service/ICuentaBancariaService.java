package com.uce.edu.service;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public CuentaBancaria buscar(String id);
	public void guardar(CuentaBancaria cuentaBancaria);
}
