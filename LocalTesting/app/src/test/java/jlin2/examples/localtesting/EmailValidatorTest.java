package jlin2.examples.localtesting;

import static org.junit.Assert.*;
import org.junit.Test;

public class EmailValidatorTest {
       @Test
    public void testValidEmail() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"));
    }

    @Test
    public void testValidSubdomainEmail() {
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"));
    }

    @Test
    public void testInvalidEmail_NoDomain() {
        assertFalse(EmailValidator.isValidEmail("123@abc"));
    }

    @Test
    public void testInvalidEmail_DoubleDots() {
        assertFalse(EmailValidator.isValidEmail("123@abc..com"));
    }
    
}