package org.example.class1;

import java.util.Scanner;

public class ReturnBook implements Operation {
    @Override
    public void operationBook(BookList bookList) {
        // input new book info
        System.out.println("归还书籍!");
        System.out.println("请输入需归还书籍的id: ");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();

        // search book
        if (Integer.valueOf(id) >= bookList.getSize() || Integer.valueOf(id) < 0) {
            System.out.println("无此书籍!");
        }

        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (!book.getId().equals(id)) {
                continue;
            }
            if (book.getState() == false) {
                System.out.println("此书无借出记录! 请确认输入的书籍id ");
                break;
            } else {
                book.setState(false);
                System.out.println("归还成功");
            }
        }

    }
}
