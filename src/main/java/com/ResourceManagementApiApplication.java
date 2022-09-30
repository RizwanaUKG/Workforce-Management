package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ResourceManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceManagementApiApplication.class, args);
	}

}
