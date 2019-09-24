package org.saheb.jms.controller;

import org.saheb.jms.beans.Employee;
import org.saheb.jms.producer.JmsPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/publish")
public class JmsController {
	@Autowired
	JmsPublisher publisher;

	@GetMapping("/{name}")
	public String publish(@PathVariable("name") final String name) {
		Employee employee = new Employee();
		employee.setEmpId(100);
		employee.setEmpName(name);
		publisher.send(employee);
		return "Published Successfully";
	}
}