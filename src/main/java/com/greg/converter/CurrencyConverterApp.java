package com.greg.converter;

import com.greg.converter.domain.Currency;
import com.greg.converter.domain.CurrencyRepository;
import com.greg.converter.domain.User;
import com.greg.converter.domain.UserRepository;
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

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConverterApp.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {

            userRepository.save(new User("admin", "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG"));

            currencyRepository.save(new Currency("Us Dollar", "USD", new BigDecimal(100), new BigDecimal("3.92")));
            currencyRepository.save(new Currency("Euro", "EUR", new BigDecimal(300), new BigDecimal("4.52")));
            currencyRepository.save(new Currency("Zloty", "PLN", new BigDecimal(100), new BigDecimal("2.2")));
        };
    }

}
