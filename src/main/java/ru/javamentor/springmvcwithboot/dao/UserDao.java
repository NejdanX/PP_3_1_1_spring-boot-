package ru.javamentor.springmvcwithboot.dao;

import ru.javamentor.springmvcwithboot.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User findUserById(long id);
}
