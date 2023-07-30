package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

	 ApplicationContext context =SpringApplication.run(BootjpaexampleApplication.class, args);
	 UserRepository userRepository =context.getBean(UserRepository.class);
//
//	 User user = new User();
//	 user.setName("Ankit Pal");
//	 user.setCity("Lucknow");
//
//	User user1 = userRepository.save(user);
//	System.out.println(user1);

	//Create object of user
//	 User user1 = new User();
//	 user1.setName("Uttam");
//	 user1.setCity("city1");
//	 user1.setStatus("Java Programmer");
//
//	 User user2 = new User();
//	 user2.setName("Ankit");
//	 user2.setCity("city2");
//	 user2.setStatus("Python Programmer");

	 //saving single user
//	User resultUser = userRepository.save(user2);

//	 List<User> users = List.of(user1,user2);  //Listof is a java 9 method fot data in to list
//
//		//save multiple user
//	 Iterable<User>	 result =  userRepository.saveAll(users);
//
//	 result.forEach(user -> {
//		 System.out.println(user);
//	 });
//
////	System.out.println("saved user" + resultUser);
//	System.out.println("done..");
//	System.out.println();

		// update th user of id=11

//		Optional<User> optional = userRepository.findById(2);
//
//		User user = optional.get();
//
//		user.setName("Ankit Yadav");
//
//	 User result =	userRepository.save(user);
//
//		System.out.println(result);

		//how to get the data
		// findById(id) - return optional Containing your data


//	Iterable<User> itr =	userRepository.findAll();
//	Iterable<User>  iterable = itr.iterator();
//	 while (iterable.iterator().hasNext()){
//		 User user = iterable.iterator().next();
//		 System.out.println(user);
//	 }
//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User user) {
//				System.out.println(user);
//			}
//		});


//		Lamdada function
//		itr.forEach(user -> {
//			System.out.println(user);
//		});


//		deleting the user
//		userRepository.deleteById(52);
//		System.out.println("deleted");

//		Iterable<User> allusers = userRepository.findAll();
//
//		allusers.forEach(user -> System.out.println(user));
//
//		userRepository.deleteAll(allusers);

		//derived query method uses
	 List<User> users =	userRepository.findByNameAndCity("Ankit Pal","Lucknow");
	 users.forEach(e -> System.out.println(e) );






	}

}
