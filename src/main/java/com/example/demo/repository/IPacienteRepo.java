package com.example.demo.repository;

import com.example.demo.repository.modelo.Paciente;

public interface IPacienteRepo {
	
	
	public void insertar(Paciente paciente);
	public Paciente buscar(String cedulaPaci);

}
