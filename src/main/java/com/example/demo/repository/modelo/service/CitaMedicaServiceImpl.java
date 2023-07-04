package com.example.demo.repository.modelo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICitaMedicaRepo;
import com.example.demo.repository.IDoctorRepo;
import com.example.demo.repository.IPacienteRepo;
import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired 
	private IPacienteRepo iPacienteRepo;
	@Autowired
	private IDoctorRepo doctorRepo;
	
	@Autowired
	private ICitaMedicaRepo citaMedicaRepo;
	
	
	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		citaMedicaRepo.actualizar(citaMedica);
	}

	@Override
	public CitaMedica Buscar(String numeroCita) {
		// TODO Auto-generated method stub
		return citaMedicaRepo.Buscar(numeroCita);
	}

	@Override
	public void agendar(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita,
			String cedulaDoc, String cedulaPaci) {
		// TODO Auto-generated method stub
		
		CitaMedica citaMedica = new CitaMedica();
		Doctor doctor = doctorRepo.buscar(cedulaDoc);
		Paciente paciente = iPacienteRepo.buscar(cedulaPaci);
		
		
		citaMedica.setDoctor(doctor);
		citaMedica.setPaciente(paciente);
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setNumeroCita(numeroCita);
		citaMedica.setValorCita(valorCita);
		citaMedica.setLugarCita(lugarCita);
		citaMedicaRepo.insertar(citaMedica);
		
		System.out.println("Cita Agendada");
		
		
		
		
	}

	@Override
	public void actualizarDatosCita(String numeroCita, String diagnostico, String receta, LocalDateTime proximaCita) {
		// TODO Auto-generated method stub
		
		
		CitaMedica citaMedica = this.Buscar(numeroCita);
		citaMedica.setDiagnotico(diagnostico);
		citaMedica.setReceta(receta);
		citaMedica.setFechaProximaCita(proximaCita);
		
		citaMedicaRepo.actualizar(citaMedica);
		System.out.println( "Cita Actualizada");
		
	}

}
