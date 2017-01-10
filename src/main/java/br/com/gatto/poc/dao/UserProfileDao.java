package br.com.gatto.poc.dao;
 
import java.util.List;

import br.com.gatto.poc.model.UserProfile;
 
 
public interface UserProfileDao {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}