package com.example;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("GitHub Actions Deployment POC");
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("4 * 5 = " + calculator.multiply(4, 5));
    }
}
