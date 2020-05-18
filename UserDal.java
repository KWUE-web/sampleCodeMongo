package com.example.demokwue.repository;

import java.util.List;

import com.example.demokwue.model.User;

public interface UserDal {

	List<User> getAllUsers();

	User getUserById(String userId);

	User addNewUser(User user);

	Object getAllUserSettings(String userId);

	String getUserSetting(String userId, String key);

	String addUserSetting(String userId, String key, String value);
}