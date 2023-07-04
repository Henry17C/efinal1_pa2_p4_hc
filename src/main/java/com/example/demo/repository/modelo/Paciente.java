package com.example.demo.repository.modelo;

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
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_paci")
	@SequenceGenerator(name = "seq_paci", sequenceName = "seq_paci", allocationSize = 1)
	@Column (name = "paci_id")
	private Integer id;
	
	@Column (name = "paci_cedula")
	private String cedula;
	
	@Column (name = "paci_apellido")
	private String apellido;
	
	@Column (name = "paci_nombre")
	private String nombre;
	
	@Column (name = "paci_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	
	@Column (name = "paci_cod_seguro")
	private String codigoSeguro;
	
	@Column (name = "paci_estatura")
	private Double estatura;
	
	@Column (name = "paci_peso")
	private Double peso;
	
	@Column (name = "paci_genero")
	private String genero;
	
	@OneToMany(mappedBy = "paciente")
	private List<CitaMedica> citasMedicas;

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<CitaMedica> getCitasMedicas() {
		return citasMedicas;
	}

	public void setCitasMedicas(List<CitaMedica> citasMedicas) {
		this.citasMedicas = citasMedicas;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCodigoSeguro() {
		return codigoSeguro;
	}

	public void setCodigoSeguro(String codigoSeguro) {
		this.codigoSeguro = codigoSeguro;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", cedula=" + cedula + ", apellido=" + apellido + ", nombre=" + nombre
				+ ", fechaNacimiento=" + fechaNacimiento + ", codigoSeguro=" + codigoSeguro + ", estatura=" + estatura
				+ ", peso=" + peso + ", genero=" + genero + "]";
	}

	
	
	
	
	

	
}
