package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.repository.modelo.service.ICitaMedicaService;
import com.example.demo.repository.modelo.service.IDoctorService;
import com.example.demo.repository.modelo.service.IPacienteService;

@SpringBootApplication
public class Prueba1PaP4HcApplication  implements CommandLineRunner{

	@Autowired 
	private IPacienteService iPacienteService;
	@Autowired
	private IDoctorService iDoctorService;
	
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaP4HcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Paciente paciente= new Paciente();
		paciente.setApellido("Mendez");
		paciente.setCedula("1234");
		paciente.setCodigoSeguro("abc");
		paciente.setEstatura(12.2);
		paciente.setFechaNacimiento(LocalDateTime.now());
		paciente.setGenero("M");
		paciente.setNombre("MAx");
		paciente.setPeso(20.0);
		
		Doctor doctor= new Doctor();
		doctor.setApellido("Perez");
		doctor.setCedula("1234");
		doctor.setCodigoSenescyt("ABC");
		doctor.setFechaNacimiento(LocalDateTime.of(1989, 10, 10, 10, 10));
		doctor.setGenero("M");
		doctor.setNombre("Fred");
		doctor.setNumeroConsultorio("1");
		
		//1 .INGRESO DE PACIENTE
		iPacienteService.insertar(paciente);
		System.err.println(iPacienteService.buscar("1234"));
		
		//2. INGRESI DE DOCTOR
		iDoctorService.insertar(doctor);
		System.out.println(iDoctorService.buscar("1234"));
		
		//3 ANGENDAR CITA MEDICA
		
		citaMedicaService.agendar("1", LocalDateTime.now(), new BigDecimal(20), "Sala 1", "1234", "1234");
		System.out.println(citaMedicaService.Buscar("1"));
		
		//4. ACTUALZAR CITA MEDICA
		citaMedicaService.actualizarDatosCita("1", "Laringitis", "Paracetamol", LocalDateTime.of(2024, 2, 2, 2, 2));
		
		System.out.println("FIN");
	}

}
