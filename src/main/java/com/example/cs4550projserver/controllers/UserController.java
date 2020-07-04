package com.example.cs4550projserver.controllers;

import com.example.cs4550projserver.models.User;
import com.example.cs4550projserver.services.UserService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true")
public class UserController {

    UserService service = new UserService();

    @GetMapping("/users/{username}")
    public boolean isUsernameAvailable(@PathVariable("username") String username) {
        return service.isUsernameAvailable(username);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @PostMapping("/users")
    public int registerNewUser(@RequestBody User newUser) {
        return service.registerNewUser(newUser);
    }

    @PostMapping("/login")
    public User loginUser(HttpSession session, @RequestBody User user) {
        User newLogin = service.loginUser(user.getUsername(), user.getPassword());
        if (!newLogin.getUsername().equals("")) {
            session.setAttribute("profile", newLogin);
        }
        return newLogin;
    }

    @PostMapping("/profile")
    public User profile(HttpSession session) {
        User profile = (User)session.getAttribute("profile");
        if (profile == null) return new User("","", false);
        return profile;
    }

    @DeleteMapping("/users/{username}")
    public int deleteUser(@PathVariable("username") String username) {
        return service.deleteUser(username);
    }
    
    @GetMapping("/logout")
    public int logout(HttpSession session) {
        session.removeAttribute("profile");
        return 1;
    }
}
