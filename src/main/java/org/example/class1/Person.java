package org.example.class1;

import java.util.ArrayList;

abstract class Person {
    public String name;
    public String gender;
    public String status;

    public Operation[] operation;

    public Person (String name, String gender, String status) {
        this.name = name;
        this.gender= gender;
        this.status = status;
    }

    //  get person info
    public String getName (){
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getStatus() {
        return status;
    }

    //  set person info
    public void setName (String name){
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender =  gender;
    }

    public void setstatus(String status) {
        this.status =  status;
    }

    // library menu
    abstract public int menu();

    public void doOperation(int option, BookList bookList) {
        operation[option].operationBook(bookList);
    }

}
