package org.example.back_end.exception;

public class ResourceAlreadyFoundException extends RuntimeException {
        public ResourceAlreadyFoundException(String message) {
            super(message);
        }
}

