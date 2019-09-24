package org.saheb.jms.producer;

import javax.jms.Topic;

import org.saheb.jms.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsPublisher {
	@Autowired
	JmsTemplate jmsTemplate;

	@Autowired
	Topic topic;

	public void send(Employee employee) {
		jmsTemplate.convertAndSend(topic, employee);
	}
}
