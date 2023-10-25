package com.knowlege.pageableendpoint.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.knowlege.pageableendpoint.domain.User;
import com.knowlege.pageableendpoint.repositories.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public Page<User> getUsersPageable(@RequestParam("page") final int page, @RequestParam("size") final int size) {

        final Pageable pageable = PageRequest.of(page, size);

        return userRepository.findAll(pageable);

    }

}
