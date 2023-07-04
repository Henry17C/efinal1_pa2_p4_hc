package com.example.demo.repository.modelo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.demo.repository.modelo.CitaMedica;

public interface ICitaMedicaService {
	
	public void insertar(CitaMedica citaMedica);
	public void actualizar(CitaMedica citaMedica);
	public CitaMedica Buscar(String numeroCita);
	
	public void agendar(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita, String cedulaDoc, String cedulaPaci);

	public void actualizarDatosCita(String numeroCita, String diagnostico, String receta, LocalDateTime proximaCita);
	
	
}
