package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo{

	@PersistenceContext 
	private EntityManager entityManager;
	
	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		entityManager.persist(citaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		entityManager.merge(citaMedica);
	}

	@Override
	public CitaMedica Buscar(String numeroCita) {
		TypedQuery<CitaMedica> query= this.entityManager.createQuery("Select d from CitaMedica d where d.numeroCita= :numeroCita", CitaMedica.class);
		query.setParameter("numeroCita", numeroCita);
		return query.getSingleResult();
	}

}
