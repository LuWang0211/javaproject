package org.example.class1;

import java.util.ArrayList;

public class BookList {
    private Book[] books = new Book[50];
    private Integer size;

    public BookList () {
        books[0] = new Book("I247.55/001", "三体世界", new String[]{"刘慈欣"}, "科幻", false);
        books[1] = new Book("I247.57/002", "亿万宇宙", new String[]{"刘慈欣", "刘洋"}, "科幻", false);
        books[2] = new Book("I247.57/003", "外星人手册", new String[]{"刘慈欣", "罗隆翔"}, "科幻", false);
        books[3] = new Book("I247.57/004", "地球大炮", new String[]{"刘慈欣", "夏茄"}, "科幻", false);
        books[4] = new Book("I247.57/005", "乱纪元", new String[]{"刘慈欣","何夕"}, "科幻", false);
        size = 5;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Book getBook(int index) {
        return books[index];
    }

    public void setBooks(int index, Book book) {
        books[index] = book;
    }

}
