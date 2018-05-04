package com.jeho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * 
 * @author jeho.han
 *
 */
@SpringBootApplication
public class PrototypeRestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PrototypeRestApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PrototypeRestApplication.class);
	}
}