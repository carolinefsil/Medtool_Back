package com.medtool.Medtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableJms
@EnableWebSecurity
@SpringBootApplication
public class MedtoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedtoolApplication.class, args);
	}

}
