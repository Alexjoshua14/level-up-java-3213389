package com.linkedin.javacodechallenges;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {

    public static boolean isPasswordComplex(String password) {
        // Requirements:
        // At least six characters
        // One uppercase letter
        // One lowercase letter
        // One number

        // Can check for each thing separately in O(n)-time taking O(4n) == O(n)

        if (password.length() < 6)
            return false;

        boolean hasDigit = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c))
                hasDigit = true;
            else if (Character.isUpperCase(c))
                hasUppercase = true;
            else if (Character.isLowerCase(c))
                hasLowercase = true;
        }

        return hasDigit && hasUppercase && hasLowercase;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
