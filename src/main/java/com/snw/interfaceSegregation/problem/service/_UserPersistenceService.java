package com.snw.interfaceSegregation.problem.service;

import com.snw.interfaceSegregation.problem.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Stores User entities
public class _UserPersistenceService implements _PersistenceService<User> {

	private static final Map<Long, User> USERS = new HashMap<>();

	@Override
	public void save(User entity) {
		synchronized (USERS) {
			USERS.put(entity.getId(), entity);
		}
	}

	@Override
	public void delete(User entity) {
		synchronized (USERS) {
			USERS.remove(entity.getId());
		}
	}

	@Override
	public User findById(Long id) {
		synchronized (USERS) {
			return USERS.get(id);
		}
	}

	// findByName is depending on User entity
	// (not general method == all other entities should override it)
	@Override
	public List<User> findByName(String name) {
		synchronized (USERS) {
			return USERS.values().stream().filter(u->u.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		}
	}

}