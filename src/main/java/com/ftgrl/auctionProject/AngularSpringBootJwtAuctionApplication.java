package com.ftgrl.auctionProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AngularSpringBootJwtAuctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringBootJwtAuctionApplication.class, args);
		BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
		System.out.println(encoder.encode("Admin123"));
		System.out.println(encoder.encode("Admin1234"));
		System.out.println(encoder.encode("Admin12345"));
		System.out.println(encoder.encode("Moderate123"));
		System.out.println(encoder.encode("Moderate1234"));
	}

}
