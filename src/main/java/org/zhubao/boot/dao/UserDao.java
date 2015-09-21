package org.zhubao.boot.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.zhubao.boot.model.User;

public interface UserDao extends MongoRepository<User, String>{

	public User findByName(String name);
}
