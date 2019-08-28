package com.pucminas.apifb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ApifbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApifbApplication.class, args);
	}

}
