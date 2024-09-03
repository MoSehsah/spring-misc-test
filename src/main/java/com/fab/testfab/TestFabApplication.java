package com.fab.testfab;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import java.util.Set;

@SpringBootApplication
public class TestFabApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestFabApplication.class, args);
    }




}
