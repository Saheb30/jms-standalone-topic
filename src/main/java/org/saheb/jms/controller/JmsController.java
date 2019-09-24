package org.saheb.jms.controller;

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

	@GetMapping("/{message}")
	public String publish(@PathVariable("message") final String message) {
		publisher.send(message);
		return "Published Successfully";
	}
}