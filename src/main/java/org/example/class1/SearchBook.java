package org.example.class1;

import java.util.Scanner;

public class SearchBook implements Operation{
    @Override
    public void operationBook(BookList bookList) {
        // input new book info
        System.out.println("查询书籍!");
        System.out.println("请输入查询书籍的名字:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Boolean findFlag = false;
        for (int i = 0; i < bookList.getSize(); i++ ) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                String info = String.format("找到书籍", book);
                System.out.println(info);
                findFlag = true;
                break;
            }
        }

        if (findFlag == false) {
            System.out.println("没有找到该书籍");
        }
    }
}
