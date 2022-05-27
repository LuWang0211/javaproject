package org.example.class1;

import java.util.Scanner;

public class BorrowBook implements Operation {
    @Override
    public void operationBook(BookList bookList) {
        // input new book info
        System.out.println("借阅书籍!");
        System.out.println("请输入需借阅书籍的id: ");
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
            if (book.getState() == true) {
                System.out.println("此书已经被借走了!");
                break;
            }
            book.setState(true);
            System.out.println("借阅成功");
        }

    }
}
