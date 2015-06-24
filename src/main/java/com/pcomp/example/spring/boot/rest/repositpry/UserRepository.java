package com.pcomp.example.spring.boot.rest.repositpry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcomp.example.spring.boot.rest.model.User;

public interface UserRepository extends JpaRepository<User, String> {
}