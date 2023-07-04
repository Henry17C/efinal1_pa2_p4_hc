package com.example.demo.repository.modelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPacienteRepo;
import com.example.demo.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService {

	@Autowired 
	private IPacienteRepo iPacienteRepo;
	
	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		iPacienteRepo.insertar(paciente);
	}

	@Override
	public Paciente buscar(String cedulaPaci) {
		// TODO Auto-generated method stub
		return iPacienteRepo.buscar(cedulaPaci);
	}

}
