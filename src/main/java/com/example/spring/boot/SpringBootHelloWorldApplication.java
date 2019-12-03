package com.example.spring.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class SpringBootHelloWorldApplication {
	
	@Autowired
	EmployeeRepository er;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployess() {

		return er.findAll();
	}
	@PostMapping("/employees")
	public Employee saveEmployess(@RequestBody Employee e) {
		return er.save(e);
	}
	
	@PutMapping("/employees/{id}")
	public String deleteEmployess(@RequestParam(name="id") Integer id) {
		return "HelloWorld";
	}
	

}
