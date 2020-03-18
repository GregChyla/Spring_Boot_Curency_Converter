package com.greg.CurrencyConverter;

import com.greg.CurrencyConverter.domain.Currency;
import com.greg.CurrencyConverter.domain.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class CurrencyConverterApp {

    @Autowired
    private CurrencyRepository currencyRepository;

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConverterApp.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            currencyRepository.save(new Currency("Us Dollar", "USD", new BigDecimal(100), new BigDecimal("3.92")));
            currencyRepository.save(new Currency("Euro", "EUR", new BigDecimal(300), new BigDecimal("4.52")));
            currencyRepository.save(new Currency("Zloty", "PLN", new BigDecimal(100), new BigDecimal("2.2")));
        };
    }

}
