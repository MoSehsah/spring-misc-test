package com.fab.testfab;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public Validator getValidator() {
        LocalValidatorFactoryBean localValidatorFactoryBean;
        localValidatorFactoryBean = new LocalValidatorFactoryBean();
        localValidatorFactoryBean.afterPropertiesSet();

        ConstraintValidatorFactory constraintValidatorFactory = localValidatorFactoryBean.getConstraintValidatorFactory();
        ConstraintValidator<ValidUsername, String> asd = constraintValidatorFactory.getInstance(UsernameValidator.class);
        boolean is_valid = asd.isValid("asd", null);
        System.out.println("-----is_valid----------" + is_valid);

        localValidatorFactoryBean.getConstraintsForClass(User.class);
//        Set<ConstraintViolation<String>> asd = localValidatorFactoryBean.validate("asd");
//        System.out.println(asd);
//        System.out.println("Starting Hibernate Validator");
        return localValidatorFactoryBean;
    }
}
