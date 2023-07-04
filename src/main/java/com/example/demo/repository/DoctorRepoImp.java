package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DoctorRepoImp implements IDoctorRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		entityManager.persist(doctor);
	}

	@Override
	public Doctor buscar(String cedulaDoc) {
		// TODO Auto-generated method stub
		TypedQuery<Doctor> query= this.entityManager.createQuery("Select d from Doctor d where d.cedula= :cedula", Doctor.class);
		query.setParameter("cedula", cedulaDoc);
		return query.getSingleResult();
	}

}
