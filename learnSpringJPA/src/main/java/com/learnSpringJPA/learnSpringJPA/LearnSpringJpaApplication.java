package com.learnSpringJPA.learnSpringJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearnSpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(EmployeeRepository repository){
		return (args -> {
			insertJavaMembers(repository);
			System.out.println(repository.findAll());
		});
	}
	private void insertJavaMembers(EmployeeRepository repository){
		repository.save(new Employee("Vamsi", "Naga Pavan"));
		repository.save(new Employee("Ram", "Charan"));
		repository.save(new Employee("Pavan", "Kalyan"));
		repository.save(new Employee("sneha", "Gudivaka"));

	}
}
