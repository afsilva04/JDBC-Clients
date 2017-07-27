package com.group.clientrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientRestApplication.class, args);
	}

	@Bean
	public ClientJDBCTemplate getClientJDBCTemplate(){
		return new ClientJDBCTemplate();
	}
}
