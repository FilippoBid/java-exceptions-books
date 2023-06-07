package org.learning.java;


public class InvalidBookException extends RuntimeException {

    public InvalidBookException(String message) {
        super(message);
    }
}
