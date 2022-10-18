package ru.javamento.pp_3_1_1_spring_boot_crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javamento.pp_3_1_1_spring_boot_crud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
