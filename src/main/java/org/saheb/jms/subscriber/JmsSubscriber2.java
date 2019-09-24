package org.saheb.jms.subscriber;

import org.saheb.jms.beans.Employee;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsSubscriber2 {
	@JmsListener(destination = "standalone.topic", containerFactory = "employeeContainerFactory")
	public void receive(Employee employee) {
		System.out.println("Recieved Message::: " + employee.getEmpId() + "->" + employee.getEmpName());
	}
}
