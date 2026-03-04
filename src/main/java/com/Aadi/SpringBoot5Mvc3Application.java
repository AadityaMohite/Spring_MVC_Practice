package com.Aadi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Aadi.entity.Book;
import com.Aadi.repo.BookRepository;

@SpringBootApplication
public class SpringBoot5Mvc3Application  {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot5Mvc3Application.class, args);
	}

	
	
	
}
