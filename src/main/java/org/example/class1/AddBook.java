package org.example.class1;
import java.util.Scanner;

public class AddBook implements Operation {
    @Override
    public void operationBook(BookList bookList) {
        // input new book info
        System.out.println("新增一本书籍!");
        System.out.println("请输入新增书籍的id: ");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        System.out.println("请输入新增书籍的名称: ");
        String name = scanner.next();
        System.out.println("请输入新增书籍的作者(多名作者用；分开): ");
        String author = scanner.next();
        System.out.println("请输入新增书籍的类别: ");
        String category = scanner.next();

        // parse authors
        String[] authors = author.split(";");

        //  add new book into booklist
        Book book = new Book(id, name, authors, category, false);
        bookList.setBooks(bookList.getSize(), book);
        bookList.setSize(bookList.getSize() + 1);
    }
}
