package edu.aa.fly.config.democonfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "edu.aa")
public class DemoConfigClientApplication {



	public static void main(String[] args) {
		SpringApplication.run(DemoConfigClientApplication.class, args);
	}

}

