package ru.javamento.pp_3_1_1_spring_boot_crud.service;

import ru.javamento.pp_3_1_1_spring_boot_crud.model.User;

import java.util.List;

public interface UserService {
    User getUser(long id);

    void saveUser(User user);

    void removeUserById(long id);

    void updateUser(User user);

    List<User> getAllUsers();
}
