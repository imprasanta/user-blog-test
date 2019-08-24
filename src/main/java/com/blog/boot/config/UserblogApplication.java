package com.blog.boot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude =HibernateJpaAutoConfiguration.class)
@ComponentScan(basePackages = "com.blog")
public class UserblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserblogApplication.class, args);
	}

}
