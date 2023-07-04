package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Table
@Entity
public class Doctor {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_doct")
	@SequenceGenerator(name = "seq_doct", sequenceName = "seq_doct", allocationSize = 1)
	@Column (name = "doct_id")
	private Integer id;
	
	@Column (name = "doct_cedula")
	private String cedula;
	
	@Column (name = "doct_nombre")
	private String nombre;
	
	@Column (name = "doct_apellido")
	private String apellido;
	
	@Column (name = "doct_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	
	@Column (name = "doct_numero_consultorio")
	private String numeroConsultorio;
	
	@Column (name = "doct_codigoSenescyt")
	private String codigoSenescyt;
	
	@Column (name = "doct_genero")
	private String genero;


	
	@OneToMany(mappedBy = "doctor")
	private List<CitaMedica> citasMedicas;
	
	
	
	

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", numeroConsultorio=" + numeroConsultorio
				+ ", codigoSenescyt=" + codigoSenescyt + ", genero=" + genero + "]";
	}

	public String getCodigoSenescyt() {
		return codigoSenescyt;
	}

	public void setCodigoSenescyt(String codigoSenescyt) {
		this.codigoSenescyt = codigoSenescyt;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNumeroConsultorio() {
		return numeroConsultorio;
	}

	public void setNumeroConsultorio(String numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}

	

	public List<CitaMedica> getCitasMedicas() {
		return citasMedicas;
	}

	public void setCitasMedicas(List<CitaMedica> citasMedicas) {
		this.citasMedicas = citasMedicas;
	}

	


	
	
	
	
	
	
	

}
