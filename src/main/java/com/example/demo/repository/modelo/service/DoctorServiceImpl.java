package com.example.demo.repository.modelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IDoctorRepo;
import com.example.demo.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl  implements IDoctorService{

	@Autowired 
	private IDoctorRepo doctorRepo;
	
	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorRepo.insertar(doctor);
	}

	@Override
	public Doctor buscar(String cedulaDoc) {
		// TODO Auto-generated method stub
		return doctorRepo.buscar(cedulaDoc);
	}
	
}
