package org.example.a;

import org.example.b.impl.UserServiceImpl;
import org.example.c.User;
import org.example.c.UserService;

public class UserController {
    private UserService userService;

    public UserController() {
        this.userService = new UserServiceImpl();
    }

    public User findById(String id) {
        System.out.println(Config.get(id));
        return userService.findById(id);
    }

    public int save(User user) {
        return userService.save(user);
    }
}
