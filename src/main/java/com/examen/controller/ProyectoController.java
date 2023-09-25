package com.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.examen.model.Empleado;
import com.examen.repository.EmpleadoRepository;



@Controller
public class ProyectoController {

	@Autowired
	private EmpleadoRepository repos;
	
	@GetMapping("/registrar")
	public String registrar(@RequestParam(name= "prue", required = false, defaultValue = "Empleado")String prue, Model model)
	{
		Empleado empl = new Empleado();
		
		empl.setIdEmpleado(1);
		empl.setApellidos("Valverde Salvatierra");
		empl.setNombres("Javier");
		empl.setEdad(4);
		empl.setSexo("M");
		empl.setSalario(3400);
		
		empl.setIdEmpleado(2);
		empl.setApellidos("nieves vegas");
		empl.setNombres("Lucia");
		empl.setEdad(23);
		empl.setSexo("F");
		empl.setSalario(9400);
		
		empl.setIdEmpleado(3);
		empl.setApellidos("vasquez ruiz");
		empl.setNombres("Oscar");
		empl.setEdad(43);
		empl.setSexo("M");
		empl.setSalario(2300);
		
		empl.setIdEmpleado(4);
		empl.setApellidos("villanueva briceño");
		empl.setNombres("Antonella");
		empl.setEdad(44);
		empl.setSexo("F");
		empl.setSalario(8400);
		
		empl.setIdEmpleado(5);
		empl.setApellidos("Vera quispe");
		empl.setNombres("Denis");
		empl.setEdad(29);
		empl.setSexo("M");
		empl.setSalario(3420);
		
		
		empl= repos.save(empl);
		
		model.addAttribute("prue", empl);
		return "registrar";
	
	}
	
	@GetMapping("/listar")
	
	public String listar(Model model) {
		
		model.addAttribute("listar", repos.findAll());
		
		return "listar";
	}
}
