package org.example.c;

public interface UserService {

    User findById(String id);

    int save(User user);

}
