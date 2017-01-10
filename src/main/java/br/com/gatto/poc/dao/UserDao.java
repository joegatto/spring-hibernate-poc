package br.com.gatto.poc.dao;

import java.util.List;

import br.com.gatto.poc.model.User;

public interface UserDao {

	User findById(int id);

	User findBySSO(String sso);

	void save(User user);

	void deleteBySSO(String sso);

	List<User> findAllUsers();

}