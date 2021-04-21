package com.access.control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })
@ComponentScan(basePackages = {"com.access.control.*","com.access.control.config"})
@EntityScan()
//@EnableJpaRepositories("com.access.control.repository")
@EnableJpaRepositories(basePackages = "com.access.control.repository", entityManagerFactoryRef = "entityManagerFactory")
public class AccessControlSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessControlSystemApplication.class, args);
	}

}
