package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class PacienteRepoImpl   implements IPacienteRepo{

	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		entityManager.persist(paciente);
	}

	@Override
	public Paciente buscar(String cedulaPaci) {
		TypedQuery<Paciente> query= this.entityManager.createQuery("Select d from Paciente d where d.cedula= :cedula", Paciente.class);
		query.setParameter("cedula", cedulaPaci);
		return query.getSingleResult();
	}
}
