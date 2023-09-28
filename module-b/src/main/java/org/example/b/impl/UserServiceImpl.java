package org.example.b.impl;

import org.example.c.User;
import org.example.c.UserService;
import org.example.c.util.FileUtil;

public class UserServiceImpl implements UserService {
    @Override
    public User findById(String id) {
        String fileName = FileUtil.getFileName("path/to/a/b/c/hello.txt");
        User user = new User();
        user.setId(id);
        user.setName(fileName);
        return user;
    }

    @Override
    public int save(User user) {
        System.out.println(user.getName());
        return 1;
    }
}
