package com.cg.rest.restservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.rest.restservice.entity.Address;
import com.cg.rest.restservice.entity.Employee;
import com.cg.rest.restservice.repository.EmployeeRepository;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner populateData(EmployeeRepository repository) {
		return (arg) -> {
			repository.save(new Employee(101, "Unnati", new Address(1001, "Pristine", "Khadaki Road", "Pune", 411030),
					20000.0));
			repository.save(new Employee(102, "Kirti", new Address(2001, "Arora", "Prabhat Road", "Mumbai", 400708),
					54000.0));
			repository.save(new Employee(103, "Pranati", new Address(1018, "Kumar", "Swargate", "Pune", 422010),
					780000.0));
			repository.save(new Employee(104, "Mrunal", new Address(5020, "Peace", "Nashik Road", "Nashik", 432012),
					32000.0));
			repository.save(new Employee(105, "Pooja", new Address(4001, "Mannat", "Mumbai Road", "Satara", 511002),
					8000.0));
			
		};

	}
}
