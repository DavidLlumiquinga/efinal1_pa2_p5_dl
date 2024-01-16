package com.uce.edu.service;

import com.uce.edu.repository.modelo.Propietario;

public interface IPropietarioService {

	public Propietario buscar(String id);
	public void guardar(Propietario propietario);
}
