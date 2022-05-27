package org.example.class1;

import java.util.Scanner;

public class Admin extends Person {
    public Admin(String name, String gender, String status) {
        super(name, gender, status);
        operation = new Operation[] {
                new AddBook(),
                new DelBook(),
                new SearchBook(),
        };
    }

    @Override
    public int menu() {
        System.out.println("Hello Admin！");
        System.out.println("1. Add book; 2. Delete book; 3. Find book; 0. Exit");
        System.out.println("Please enter operation number: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        return option;
    }
}
