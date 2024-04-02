package com.coderslayer.fitness.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderslayer.fitness.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    public Optional<User> findByUsername(String username);
}
