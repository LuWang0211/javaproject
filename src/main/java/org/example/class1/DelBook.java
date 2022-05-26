package org.example.class1;

import java.util.Scanner;

public class DelBook implements Operation{
    @Override
    public void operationBook(BookList bookList) {
        // input new book info
        System.out.println("删减一本书籍!");
        System.out.println("请输入删减书籍的id: (如无需删减，请输入exit)");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();

        //  cancel del book
        if ( id == "exit") {
            System.out.println("取消删除书籍!");
            return;
        }

        // null input
        int i = 0;
        while (id == null && i <= 3) {
            System.out.println("未输入信息，如需删减书籍，请输入书籍的id: (如无需删减，请输入exit)");
            id = scanner.next();
            if ( id == "exit") {
                System.out.println("取消删除书籍!");
                return;
            }
            if ( id != null)
                break;
            i++ ;
        }

        int j = 0;
        if (id != null && id != "exit") {
            for (; j < bookList.getSize(); j++) {
                Book book = bookList.getBook(i);
                if (book.getId().equals(id)) {
                    String info = String.format("确认删除！%s 请输入yes, 取消删除输入 No", book.getId());
                    System.out.println(info);
                    String confirmed = scanner.next();
                    if (confirmed == "yes") {
                        Book lastBook = bookList.getBook(bookList.getSize() - 1);
                        bookList.setBooks(j, lastBook);
                        bookList.setSize(bookList.getSize() - 1);
                        System.out.println("删除成功！");
                    } else {
                        System.out.println("取消删除！");
                    }
                    return;
                }
            }

            if (j >= bookList.getSize()) {
                System.out.println("没有找到相关书籍！");
                return;
            }
        }
    }
}
