package br.gov.workmade.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class ConnectionEntityManager {
	
	@PersistenceContext(unitName = "named-query-unit")
	private EntityManager entityManger;
	

	@SuppressWarnings("unchecked")
	public List<Object[]> departamentos() {
		Query query = 
		this.entityManger.createNamedQuery("D.departamentos");
		return query.getResultList();
		
	}	

}
