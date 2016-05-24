package com.nayeem.joy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BaseDaoImpl implements BaseDao{
	
	@PersistenceContext
	private EntityManager em;
	@Override
	public void persist(Object obj) {
		// TODO Auto-generated method stub
		em.persist(obj);
	}
	
	@Override
	public <T> List<T> getAll(Class<T> clazz) {
		
		
		TypedQuery<T> query = em.createQuery("from " + clazz.getName(), clazz);
		
		return query.getResultList();
	}
}
