package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Propietario;
import com.uce.edu.service.IPropietarioService;
import com.uce.edu.service.ITranferenciaSerive;

@SpringBootApplication
public class Efinal1Pa2P5DlApplication  implements CommandLineRunner{

	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private ITranferenciaSerive iTranferenciaService;
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P5DlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		CuentaBancaria cuenta1=new CuentaBancaria();
		cuenta1.setNumero("123456");
		cuenta1.setSaldo(new BigDecimal(500));
		cuenta1.setTipo("Ahorros");
		
		CuentaBancaria cuenta2=new CuentaBancaria();
		cuenta2.setNumero("654321");
		cuenta2.setSaldo(new BigDecimal(1500));
		cuenta2.setTipo("Ahorros");
		
		Propietario pro1=new Propietario();
		pro1.setNombre("David");
		pro1.setApellido("Llumiquinga");
		pro1.setCedula("172586330");
		pro1.setCuentaBancaria(cuenta1);
		
		
		
		Propietario pro2=new Propietario();
		pro2.setNombre("Manuel");
		pro2.setApellido("Perez");
		pro2.setCedula("172598612");
		pro2.setCuentaBancaria(cuenta2);
		
		this.iPropietarioService.guardar(pro1);
		this.iPropietarioService.guardar(pro2);
		
		this.iTranferenciaService.realizarTransferencia(cuenta1, cuenta2);
		
		
		
	}

	
	
	
}
