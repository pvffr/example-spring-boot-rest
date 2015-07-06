package com.pcomp.example.spring.boot.rest.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pcomp.example.spring.boot.rest.model.User;
import com.pcomp.example.spring.boot.rest.repository.UserRepository;
import com.pcomp.example.spring.boot.rest.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Inject
    public UserServiceImpl(final UserRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public User save(final User user) {
        return repository.save(user);
    }

}