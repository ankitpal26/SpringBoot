package com.jpa.test.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.User;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Integer> {

	//derived query method
	public List<User> findByName(String name);

	public List<User> findByNameAndCity(String name, String city);

	@Query("select u FROM  u")                              //@Query has to types 1-> JPQL query
	public List<User> getAllUser();            // 2-> native query


	@Query("select u FROM User u WHERE u.name=: n")
	public List<User> getUserByName(@Param("n") String name);

	//other derived query method
	//findByNameStartingWith(String prefix)
	//findByNameEndingWith(String suffix)
	//findByNameContaining(String words)

	//findByNameLike(String likePattern)

	//findByAgeLessThan(int age)
	//findByAgeGreaterThanEqual(int age)
	//findByAgeIn(Collection<Integer> age)
	//findByNameOrderByName(String name)

}