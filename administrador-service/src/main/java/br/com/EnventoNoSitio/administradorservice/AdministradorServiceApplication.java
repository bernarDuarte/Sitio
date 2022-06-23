package br.com.EnventoNoSitio.administradorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AdministradorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdministradorServiceApplication.class, args);
	}

}
