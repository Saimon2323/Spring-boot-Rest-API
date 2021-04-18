package com.saimon;

import com.saimon.models.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestPatientApplication {

	public static final Logger log = LoggerFactory.getLogger(RestPatientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestPatientApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) {
		CommandLineRunner publisher = args -> {
			Quote quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
			log.info("Quote: {}", quote);

			log.info("Quote - Type: {}", quote.getType());
			log.info("Quote - Value: {}", quote.getValue().toString());
			log.info("Quote - Value - id: {}", quote.getValue().getId());
			log.info("Quote - Value - quote: {}", quote.getValue().getQuote());
		};

		return publisher;
	}

}
