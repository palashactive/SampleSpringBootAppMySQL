package com.ms.interview;

import com.ms.interview.entity.Employee;
import com.ms.interview.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class RestApiApplication implements CommandLineRunner{
public class RestApiApplication {

	/*@Autowired
	private EmployeeRepository employeeRepository;*/

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		employeeRepository.save(new Employee(1, "Palash"));
		employeeRepository.save(new Employee(2, "Prateek"));
	}*/
}
