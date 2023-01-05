package com.nttdata.service;

import java.sql.Date;
import java.util.List;

import com.nttdata.persistence.Client;

/**
 * Client Service Interface
 * 
 * @author Christian
 *
 */

public interface ClientServiceI {
	
	/**
	 * Añade un cliente
	 * 
	 * @param nombre
	 * @param surname
	 * @param dni
	 * @param date
	 */

	public void addClient (String nombre, String surname, String dni, Date birthDay);
	
	/**
	 * Busca un cliente por nombre y apellidos
	 * 
	 * @param name
	 * @param surname
	 * @return
	 */
	
	public Client findFullName(String name,String surname);
	
	/**
	 * Lista todos los clientes por nombre, apellidos, dni, fecha de nacimiento e id
	 * 
	 * @return
	 */
	
	public List<Client> all();
	
}
