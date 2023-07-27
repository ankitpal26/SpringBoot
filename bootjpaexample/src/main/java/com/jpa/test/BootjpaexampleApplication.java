package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		
	
	 ApplicationContext context =SpringApplication.run(BootjpaexampleApplication.class, args);
	 UserRepository userRepository =context.getBean(UserRepository.class);
//	 User user = new User();
//	 user.setName("Ankit Pal");
//	 user.setCity("Lucknow");
//	 
//	User user1 = userRepository.save(user);
//	System.out.println(user1);
	 User user1 = new User();
	 user1.setName("Uttam");
	 user1.setCity("city1");
	
	 User user2 = new User();
	 user2.setName("Ankit");
	 user2.setCity("city2");
	 
	User resultUser = userRepository.save(user2);
	System.out.println("saved user" + resultUser);
	System.out.println("done..");
	System.out.println();
	}

}
