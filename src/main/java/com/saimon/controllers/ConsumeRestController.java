package com.saimon.controllers;

import com.saimon.models.Quote;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Muhammad Saimon
 * @since Apr 4/18/21 11:32 AM
 */

@Slf4j
@RestController
@RequestMapping("/consume/api")
public class ConsumeRestController {

    private RestTemplate restTemplate;

    public ConsumeRestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public ResponseEntity<Quote> consumeRestData() {

        String url = "https://quoters.apps.pcfone.io/api/random";

        Quote quote = restTemplate.getForObject(url, Quote.class);

        log.info("Quote: {}", quote);

        log.info("Quote - Type: {}", quote.getType());
        log.info("Quote - Value: {}", quote.getValue().toString());
        log.info("Quote - Value - id: {}", quote.getValue().getId());
        log.info("Quote - Value - quote: {}", quote.getValue().getQuote());

        return ResponseEntity.ok(quote);
    }

}
