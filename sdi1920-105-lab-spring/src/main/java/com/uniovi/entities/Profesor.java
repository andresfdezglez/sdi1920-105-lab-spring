package com.uniovi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Profesor {

	@Id
	private String dni;
	private String nombre;
	private String apellido;
	private String categoria;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	

	public Profesor(String dni, String nombre, String apellido, String categoria) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.categoria = categoria;
	}
	
	public Profesor(String nombre, String apellido, String categoria,Department department) {
		super();
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.categoria = categoria;
		this.department = department;
	}

	public Profesor() {
		
	}
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getCategoria() {
		return categoria;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", categoria=" + categoria
				+ "]";
	}


	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
