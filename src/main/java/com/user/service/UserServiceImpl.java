package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserServiceImpl implements UserService {

    List<User> list= Stream.of(new User(1311L,"Upender","23555"),
            new User(1312L,"Ram","23556"),
            new User(1313L,"Har","6888")).collect(Collectors.toList());
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
}
