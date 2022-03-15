package com.ConsumingRESTFulService;

import com.ConsumingRESTFulService.domain.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestFulServiceApplication {

	//Logger
	private static final Logger log = LoggerFactory.getLogger(ConsumingRestFulServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestFulServiceApplication.class, args);
	}

	//Regresa un objeto de la clase RestTemplate
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	//Manda la solicitud, crea los objetos
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject(
					"https://quoters.apps.pcfone.io/api/random", Quote.class);
			log.info(quote.toString());
		};
	}

}
