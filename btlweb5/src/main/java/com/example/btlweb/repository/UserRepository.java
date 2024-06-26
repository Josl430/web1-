package com.example.btlweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.btlweb.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername( String username);
	User findById(Integer id);
	void deleteById(Integer id);
}
