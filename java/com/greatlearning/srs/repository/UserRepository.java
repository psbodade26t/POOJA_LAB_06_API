package com.greatlearning.srs.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.srs.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUsername(String username);
	
	

}
