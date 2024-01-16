package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Propietario;

public interface IPropietarioRepository {

	public Propietario seleccionar(String id);
	public void insertar(Propietario propietario);
}
