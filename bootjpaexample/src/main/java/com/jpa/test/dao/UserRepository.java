package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

	//derived query method
	public List<User> findByName(String name);

	public List<User> findByNameAndCity(String name, String city);

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