package net.baryshev.firstspringboot.service;

import net.baryshev.firstspringboot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    User update(Long id);

    void deleteUser(Long id);
}