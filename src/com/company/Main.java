package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> usersToAdd = new ArrayList<User>();
        usersToAdd.add(new User(4, "Goran"));
        usersToAdd.add(new User(2, "Ilija"));
        usersToAdd.add(new User(6, "Nikola"));

        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Petar"));
        users.add(new User(2, "Jovan"));
        users.add(new User(3, "Zoran"));

        for(int i=0; i<usersToAdd.size(); i++) {
            if(users.get(i).getId() == usersToAdd.get(i).getId()) {
                users.remove(users.get(i));
            }
            users.add(usersToAdd.get(i));
        }

        for(User user : users) {
            System.out.println("Id: " +user.getId() + "  Name: " +user.getName());
        }

    }
}
