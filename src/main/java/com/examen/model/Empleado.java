package com.examen.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
    
	private int IdEmpleado;
	private String Apellidos;
	private String Nombres;
	private int Edad;
	private String Sexo;
	private double Salario;
	
	@Override
	public String toString() {
		return "Empleado [IdEmpleado=" + IdEmpleado + ", Apellidos="+Apellidos+
			",Nombres=" + Nombres + ", Edad="+ Edad	+ ", Sexo=" + Sexo + ",Salario" + Salario + " ]";
	}
	
	public int getIdEmpleado() {
		return IdEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		IdEmpleado = idEmpleado;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	
	
}
