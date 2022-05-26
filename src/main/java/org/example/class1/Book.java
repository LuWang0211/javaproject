package org.example.class1;

import java.util.ArrayList;

public class Book {
    //  set book id, name, author, category, storedNum, isBorrow;
    private String id;
    private String name;
    private String[] author;
    private String category;
    private Boolean state;

    //  define Book attribute
    public Book (String id, String name, String[] author, String category, Boolean state){
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        this.state = state;
    }

    //  get book attribute
    public String getId (){
        return id;
    }

    public String getName (){
        return name;
    }

    public String[] getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public Boolean getState() {
        return state;
    }

    //  set book attribute
    public void setId (String id){
        this.id = id;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category =  category;
    }

    public void setState(Boolean state) {
        this.state =  state;
    }

}
