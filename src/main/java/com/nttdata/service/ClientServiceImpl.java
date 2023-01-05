package com.nttdata.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.nttdata.persistence.Client;
import com.nttdata.repository.ClientRepository;

/**
 * Client Service Implements
 * 
 * @author Christian
 *
 */

@Service
@Primary
public class ClientServiceImpl implements ClientServiceI{

	@Autowired
	ClientRepository rep;

	@Override
	public Client findFullName(String name, String surname) {
		return rep.findByNameAndSurname(name, surname);
	}

	@Override
	public List<Client> all() {
		return rep.findAll();
	}

	@Override
	public void addClient(String nombre, String surname, String dni, Date birthDay) {
		Client newClient = new Client();
		newClient.setName(surname);
		newClient.setSurname(surname);
		newClient.setDni(dni);
		newClient.setBirthDay(null);
		rep.save(newClient);
		
	}

	

}
