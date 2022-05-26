package org.example.class1;

import java.util.ArrayList;

public class Library {

    ArrayList<Person> people;
    ArrayList<Book> books;

    public Library() {
        this.people = new ArrayList<Person>();
        this.books = new ArrayList<Book>();
    }

    public void allowPersonIn(Person p) {
        this.people.add(p);
    }

    public void addBook(Book b) {
        this.books.add(b);
    }

    public int getPeopleCount() {
        return this.people.size();
    }
}
