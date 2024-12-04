package ru.umnikov.spring_springboot.springboot_3_1_2.service;


import ru.umnikov.spring_springboot.springboot_3_1_2.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    void save(User user);
    User getById(int id);
    void delete(int id);
    void update(User user, int id);
}
