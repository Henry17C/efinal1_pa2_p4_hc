package com.example.demo.repository;

import com.example.demo.repository.modelo.Doctor;

public interface IDoctorRepo {
	
	
	public void insertar(Doctor doctor);
	public Doctor buscar(String cedulaDoc);

}
