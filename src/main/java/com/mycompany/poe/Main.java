package com.mycompany.poe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login login = new Login();

        System.out.println("Enter first name:");
        String firstName = input.nextLine();

        System.out.println("Enter last name:");
        String lastName = input.nextLine();

        System.out.println("Enter username:");
        String username = input.nextLine();

        System.out.println("Enter password:");
        String password = input.nextLine();

        System.out.println("Enter SA cell number (+27):");
        String cell = input.nextLine();

        String registerMessage = login.registerUser(username, password, cell, firstName, lastName);
        System.out.println(registerMessage);

        if (registerMessage.equals("User successfully registered.")) {

            System.out.println("\nLOGIN:");

            System.out.println("Enter username:");
            String loginUser = input.nextLine();

            System.out.println("Enter password:");
            String loginPass = input.nextLine();

            boolean success = login.loginUser(loginUser, loginPass);

            System.out.println(login.returnLoginStatus(success));
        }
    }
}