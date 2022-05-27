package org.example.class1;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

//    ArrayList<Person> people;
//    ArrayList<Book> books;

//    public Library() {
//        this.people = new ArrayList<Person>();
//        this.books = new ArrayList<Book>();
//    }

    //    public void allowPersonIn(Person p) {
//        this.people.add(p);
//    }
//
//    public void addBook(Book b) {
//        this.books.add(b);
//    }
//
//    public int getPeopleCount() {
//        return this.people.size();
//    }
    public static void main(String[] args) {

        System.out.println("Welcome to Sha Bao's Library System");
        BookList bookList = new BookList();
        Person person = login();
        while (true) {
            int option = person.menu();
            person.doOperation(option, bookList);
        }
    }

    public static Person login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Login Section");
        System.out.println("Please enter your name：");
        String name = scanner.next();
        System.out.println("Please enter your gender：");
        String gender = scanner.next();
        System.out.println("Please enter your role number：1. Admin  2.Professor  3.Student 4.Log Out");
        int num = scanner.nextInt();

        if (1 == num) {
            // 管理员操作
            String status = "Admin";
            System.out.println("Login Successfully！");
            return new Admin(name, gender, status);

        } else if (2 == num) {
            // 老师操作
            String status = "Professor";
            System.out.println("Login Successfully！");
            return new Professor(name, gender, status);

        } else if (3 == num) {
            // 学生操作
            String status = "Student";
            System.out.println("Login Successfully！");
            return new Student(name, gender, status);
        } else if (4 == num) {
            System.out.println("Logout！");
        } else {
            System.out.println("Invalid Info");
        }
        return null;
    }

    public void exit() {

    }
}
