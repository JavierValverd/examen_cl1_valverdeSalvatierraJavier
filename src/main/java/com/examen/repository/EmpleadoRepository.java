package com.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, String> {
  
	
}
