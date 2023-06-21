package com.snw.singleResp.solution;

import com.snw.singleResp.problem.Store;
import com.snw.singleResp.problem.User;

// A separate class for handling persistence
public class UserPersistenceService {

	private Store store = new Store();
	
	public void saveUser(User user) {
		store.store(user);
	}
}
