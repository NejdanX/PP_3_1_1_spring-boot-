package ru.javamentor.springmvcwithboot.dao;

import ru.javamentor.springmvcwithboot.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    Optional<User> findUserById(long id);
}
