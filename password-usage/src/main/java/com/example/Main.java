package com.example;

public class Main {
    public static void main(String[] args) {
        String password = PasswordGenerator.generatePassword(12);
        System.out.println("Сгенерированный пароль: " + password);
    }
}
