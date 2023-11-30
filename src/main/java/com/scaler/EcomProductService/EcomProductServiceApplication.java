package com.scaler.EcomProductService;

import com.scaler.EcomProductService.service.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomProductServiceApplication implements CommandLineRunner {

	//private InitService initService;

//	public EcomProductServiceApplication(InitService initService) {
//		this.initService = initService;
//	}

	public static void main(String[] args) {
		SpringApplication.run(EcomProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//initService.initialise();
	}
}
