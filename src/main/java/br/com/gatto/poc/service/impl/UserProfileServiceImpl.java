package br.com.gatto.poc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.gatto.poc.dao.UserProfileDao;
import br.com.gatto.poc.model.UserProfile;
import br.com.gatto.poc.service.UserProfileService;

@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	UserProfileDao dao;

	public UserProfile findById(int id) {
		return dao.findById(id);
	}

	public UserProfile findByType(String type) {
		return dao.findByType(type);
	}

	public List<UserProfile> findAll() {
		return dao.findAll();
	}
}