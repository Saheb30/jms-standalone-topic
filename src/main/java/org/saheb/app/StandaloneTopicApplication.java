package org.saheb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication(scanBasePackages="org.saheb.jms")
@EnableJms
public class StandaloneTopicApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandaloneTopicApplication.class, args);
	}
}
