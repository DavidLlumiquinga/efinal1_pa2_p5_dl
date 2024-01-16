package com.uce.edu.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TransferenciaImpl implements ITransferenciaRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Transferencia seleccionar(String id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Transferencia.class, id);
	}

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transferencia);
	}

	@Override
	public void realizarTransferencia(CuentaBancaria bancaria1, CuentaBancaria bancaria2) {
		// TODO Auto-generated method stub

		while(true) {
			BigDecimal calcular;
			calcular=bancaria1.getSaldo().subtract(bancaria2.getSaldo());
			System.out.println("Saldo Cuenta 1"+calcular);
			
		}
		
		
	}

	
}
