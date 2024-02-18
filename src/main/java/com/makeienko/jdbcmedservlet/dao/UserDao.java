package com.makeienko.jdbcmedservlet.dao;

import com.makeienko.jdbcmedservlet.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    Optional<User> getById(long userId);
    Optional<User> getByUsername(String username);
    void save(User user);
    void update(User user);
    void delete(long userId);
}
