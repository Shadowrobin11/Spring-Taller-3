package com.nttdata.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CLIENT")
public class Client implements Serializable {

	/** SERIAL VERSION */
	private static final long serialVersionUID = 1L;

	/** Id*/
	private Long id;
	
	/** dni */
	private String dni;

	/** Nombre */
	private String name;
	
	/** Apelidos */
	private  String surname;
	
	/** fecha de nacimiento */
	private Date birthDay;
	
	
	
	
	
	/**
	 * Devuelve el id
	 * 
	 * @return id
	 */
	@Id
	@Column(name="CLIENT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	/**
	 * Inserta el dni
	 * 
	 * @param id
	 */

	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * Devuelve el dni del cliente
	 * 
	 * @return dni
	 */
	
	@Column(name = "CLIENT_DNI")
	public String getDni() {
		return dni;
	}

	/**
	 * Inserta el dni del cliente
	 * 
	 * @param dni
	 */
	
	public void setDni(String dni) {
		this.dni = dni;
	}

	
	/**
	 * 
	 * Devuelve el nombre del cliente
	 * @return name
	 */
	
	@Column(name = "CLIENT_NAME")
	public String getName() {
		return name;
	}
	
	/**
	 * Inserta nombre del cliente
	 * 
	 * @param name
	 */

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Devuelve los apellidos del cliente
	 * 
	 * @return surname
	 */
	
	@Column(name="CLIENT_SURNAME")
	public String getSurname() {
		return surname;
	}
	
	/**
	 * Inserta los apellidos del cliente 
	 * @param surname
	 */
	
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Devuelve fecha de nacimiento del cliente
	 * 
	 * @return BirthDay
	 */
	
	@Column(name="CLIENT_BIRTHDAY")
	public Date getBirthDay() {
		return birthDay;
	}

	/**
	 * Inserta la fecha de nacimiento del cliente
	 * 
	 * @param birthDay
	 */
	
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	

	@Override
	public String toString() {
		return "Client [id=" + id + ", dni=" + dni + ", name=" + name + ", surname=" + surname + ", BirthDay="
				+ birthDay + "]";
	}
	
	
	
}
