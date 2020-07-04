package com.example.cs4550projserver.services;

import com.example.cs4550projserver.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    List<User> userList = new ArrayList<User>();

    {
        User u1 = new User("jon", "password", true);
        User u2 = new User("rishab", "password", true);
        User u3 = new User("ateev", "password", true);
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
    }

    public boolean isUsernameAvailable(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public int registerNewUser(User newUser) {
        userList.add(newUser);
        return 1; // return 1 for success
    }

    public User loginUser(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return new User("", "", false);
    }

    public int deleteUser(String username) {
        for (int i = 0; i < userList.size(); i++) {
            User currUser = userList.get(i);
            if (currUser.getUsername().equals(username)) {
                userList.remove(i);
                return 1;
            }
        }
        return 0;
    }
}
