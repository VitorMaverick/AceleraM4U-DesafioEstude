package com.example.estude.validation;

public class ValidationError {

    private String input;
    private String message;

    public ValidationError(String input, String message) {
        this.input = input;
        this.message = message;
    }

    public String getInput() {
        return input;
    }


    public String getMessage() {
        return message;
    }

}
