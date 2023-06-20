package com.snw.interfaceSegregation.problem.service;

import com.snw.interfaceSegregation.problem.entity.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _OrderPersistenceService implements _PersistenceService<Order> {
	
	private static final Map<Long, Order> ORDERS = new HashMap<>();
	
	@Override
	public void save(Order entity) {
		synchronized (ORDERS) {
			ORDERS.put(entity.getId(), entity);
		}
	}

	@Override
	public void delete(Order entity) {
		synchronized (ORDERS) {
			ORDERS.remove(entity.getId());
		}
	}

	@Override
	public Order findById(Long id) {
		synchronized (ORDERS) {
			return ORDERS.get(id);
		}
	}

	// There is no need for findByName here (Order entity)
	@Override
	public List<Order> findByName(String name) {
		throw new UnsupportedOperationException();
	}
}
