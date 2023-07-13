package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.services.UserService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = ctx.getBean(UserService.class);
		userService.addUser("John");
		System.out.println("Users id="+ userService.findUserByName("John").getId());
		ctx.close();
	}

}
