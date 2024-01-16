package com.uce.edu.repository;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {

	public CuentaBancaria seleccionar(String id);
	public void insertar(CuentaBancaria cuentaBancaria);
}
