package com.nttdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.persistence.Client;

/**
 * Client Repository extends JpaRepository
 * 
 * @author Christian
 *
 */
@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

	/**
	 * Busca un cliente por nombre completo
	 * 
	 * @param name
	 * @param surname
	 * @return
	 */
	public Client findByNameAndSurname(String name, String surname);
	
	
}
