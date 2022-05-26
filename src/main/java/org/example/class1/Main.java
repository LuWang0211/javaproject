package org.example.class1;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world 2!");

        var library = new Library();


        library.allowPersonIn(new Student());
        library.allowPersonIn(new Professor());

//        library.addBook(new Book());

        System.out.println(String.format("There are %d people", library.getPeopleCount()));

    }
}