package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface EmployeeRepository extends CrudRepository<Employee, Long >{


    @Component 
public class DatabaseLoader implements CommandLineRunner { 

	private final EmployeeRepository repository;

	@Autowired 
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception { 
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
	}
}
    
}
