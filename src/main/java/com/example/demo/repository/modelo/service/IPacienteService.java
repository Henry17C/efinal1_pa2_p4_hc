package com.example.demo.repository.modelo.service;

import com.example.demo.repository.modelo.Paciente;

public interface IPacienteService {
	public void insertar(Paciente paciente);
	public Paciente buscar(String cedulaPaci);


}
