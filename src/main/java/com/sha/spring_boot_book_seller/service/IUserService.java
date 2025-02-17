package com.sha.spring_boot_book_seller.service;

import com.sha.spring_boot_book_seller.model.User;
import jakarta.transaction.Transactional;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    void makeAdmin(String username);
}
