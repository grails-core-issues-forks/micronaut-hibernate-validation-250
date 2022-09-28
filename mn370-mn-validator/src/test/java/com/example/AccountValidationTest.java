package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import javax.validation.Validator;

import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest(startApplication = false)
class AccountValidationTest {
    
    @Inject
    Validator validator;

    @Test
    void validate() {
        Account account = new Account();
        account.setUsername("foo");
        account.setPassword("bar");
        assertTrue(validator.validate(account).isEmpty());
    }
}
