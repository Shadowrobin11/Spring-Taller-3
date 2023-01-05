package com.nttdata;

import java.time.LocalDate;
import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.persistence.Client;
import com.nttdata.service.ClientServiceI;

/**
 * App -- Main
 * 
 * @author Christian
 *
 */

@SpringBootApplication()
public class App implements CommandLineRunner
{
	private final static Logger LOG = LoggerFactory.getLogger(App.class);
	
	@Autowired
	ClientServiceI clientService;
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		
		LOG.info("TRAZA INICIO");
		
		LOG.info("INSERCCIÓN DE DATOS");
		// Insercion de datos
		clientService.addClient("Juan", "Sanchez", "96385274R", Date.valueOf(LocalDate.of(1990, 07, 16)));
		clientService.addClient("Pepe", "Marquez", "36925847Q", Date.valueOf(LocalDate.of(1997, 11, 11)));
		clientService.addClient("Paco", "Lopez", "14725836F", Date.valueOf(LocalDate.of(2003, 03, 05)));
		clientService.addClient("Antonio", "Perez", "78945612L", Date.valueOf(LocalDate.of(1994, 10, 23)));
		
		
		Client client = clientService.findFullName("Paco", "Lopez");
		
		List<Client> allClients = clientService.all();
		
		System.out.println("Respuesta: " + client);
		
		for(Client c: allClients) {
			System.out.println(c);
		}
		LOG.info("TRAZA FIN");
	}
}
