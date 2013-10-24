package br.com.reservas.shared.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbstractPersistence
{

	@PersistenceContext
	private EntityManager entityManager;

	public EntityManager getEntityManager()
	{
		return entityManager;
	}

}
