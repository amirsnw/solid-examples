package com.snw.interfaceSegregation.problem.service;

import com.snw.interfaceSegregation.problem.entity.Entity;

import java.util.List;

// common interface to be implemented by all persistence services.
public interface _PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);

	// findByName is depending on User entity
	// (not general method == all other entities should override it)
	public List<T> findByName(String name);
}
