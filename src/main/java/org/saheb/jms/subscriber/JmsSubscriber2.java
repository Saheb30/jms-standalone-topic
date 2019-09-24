package org.saheb.jms.subscriber;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsSubscriber2 {
	@JmsListener(destination = "standalone.topic")
	public void receive(String msg) {
		System.out.println("Recieved Message::: " + msg);
	}
}
