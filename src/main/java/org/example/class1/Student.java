package org.example.class1;

import java.util.Scanner;

public class Student extends Person {
    public Student(String name, String gender, String status) {
        super(name, gender, status);
        operation = new Operation[] {
                new BorrowBook(),
                new ReturnBook(),
                new SearchBook(),
        };
    }

    @Override
    public int menu() {
        System.out.println("Hello Student！");
        System.out.println("1. Borrow book; 2. Return book; 3. Find book; 0. Exit");
        System.out.println("Please enter operation number: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        return option;
    }
}
