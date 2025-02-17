package com.sha.spring_boot_book_seller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-prod.properties")
public class SpringBootBookSellerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookSellerApplication.class, args);
	}

}
