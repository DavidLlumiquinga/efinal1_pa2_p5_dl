package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ITransferenciaRepository;
import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Transferencia;

@Service
public class TransferenciaService implements ITranferenciaSerive {

	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	@Override
	public Transferencia buscar(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarTransferencia(CuentaBancaria bancaria1, CuentaBancaria bancaria2) {
		// TODO Auto-generated method stub
		this.iTransferenciaRepository.realizarTransferencia(bancaria1, bancaria2);
	}

}
