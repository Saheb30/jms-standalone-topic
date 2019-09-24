package org.saheb.jms.subscriber;

import org.saheb.jms.beans.Employee;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsSubscriber {
	@JmsListener(destination = "standalone.topic")
	public void receive(Employee employee) {
		System.out.println("Recieved Message: " + employee);
	}
}
