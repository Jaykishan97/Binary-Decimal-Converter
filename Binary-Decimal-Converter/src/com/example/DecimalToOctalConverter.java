package com.example;

import java.util.Scanner;

public class DecimalToOctalConverter implements Converter {
    
    @Override
    public void convert(Scanner input) {
        System.out.println("Enter a decimal number:");
        int decimal = input.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal equivalent: " + octal);
    }
}
