package com.company;

public class User {
    public int id;
    public String name;

    public User (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }
}
