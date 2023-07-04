package com.example.demo.repository.modelo.service;

import com.example.demo.repository.modelo.Doctor;

public interface IDoctorService {
	
	public void insertar(Doctor doctor);
	public Doctor buscar(String cedulaDoc);

}
