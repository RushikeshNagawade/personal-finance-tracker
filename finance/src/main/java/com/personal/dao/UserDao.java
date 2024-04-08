package com.personal.dao;

import com.personal.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserModel,Integer> {
}
