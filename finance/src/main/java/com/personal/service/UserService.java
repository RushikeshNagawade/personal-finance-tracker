package com.personal.service;

import com.personal.model.UserModel;

import java.util.List;

public interface UserService {
    public List getUserList();

    boolean saveUserDetails(UserModel userModel);

    boolean updateUserDetails(UserModel userModel);
}
