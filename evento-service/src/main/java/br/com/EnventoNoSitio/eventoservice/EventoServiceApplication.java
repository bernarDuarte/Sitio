package br.com.EnventoNoSitio.eventoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EventoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoServiceApplication.class, args);
	}

}
