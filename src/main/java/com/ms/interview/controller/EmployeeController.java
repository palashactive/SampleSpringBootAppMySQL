package com.ms.interview.controller;

import com.ms.interview.entity.Employee;
import com.ms.interview.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/test") // This means URL's start with /test (after Application path)
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;

	/**
	 * Get all employees
	 * @return
	 */
	@GetMapping(path = "/all")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	/**
	 * Create an employee
	 * @param employee
	 * @return
	 */
	@PostMapping(path = "/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		Optional<Employee> emp = employeeRepository.findById(employee.getId());
		if(!emp.isPresent()) {
			return employeeRepository.save(employee);
		} else {
			throw new RuntimeException("Employee with id : " + employee.getId() + " already exists");
		}
	}

	/**
	 * Get employee by id
	 * @param id
	 * @return
	 */
	@GetMapping(path = "/employee")
	public Employee getEmployeeById(@RequestParam Integer id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		return employee.get();
	}

	/**
	 * Update an employee
	 * @param employee
	 * @return
	 */
	@PutMapping(path = "/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		Optional<Employee> emp = employeeRepository.findById(employee.getId());
		if(emp.isPresent()) {
			return employeeRepository.save(employee);
		} else {
			throw new RuntimeException("Employee with id : " + employee.getId() + " doesn't exists");
		}
	}

	/**
	 * Delete employee by id
	 * @param id
	 * @return
	 */
	@DeleteMapping(path = "/employee")
	public boolean deleteEmployeeById(@RequestParam Integer id) {
		try {
			employeeRepository.deleteById(id);
		} catch (Exception e) {
			throw new RuntimeException("Failed to delete employee with id : " + id);
		}
		return true;
	}
}
