package br.com.gatto.poc.service;

import java.util.List;

import br.com.gatto.poc.model.UserProfile;

public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);

	List<UserProfile> findAll();

}