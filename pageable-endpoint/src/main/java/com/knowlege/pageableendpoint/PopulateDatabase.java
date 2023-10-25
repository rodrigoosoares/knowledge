package com.knowlege.pageableendpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.knowlege.pageableendpoint.domain.User;
import com.knowlege.pageableendpoint.repositories.UserRepository;

@Component
public class PopulateDatabase implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        for (int i = 0; i <= 100; i++) {

            final User user = new User("User " + 1, "user" + i + "@email.com");

            userRepository.save(user);

            System.out.println("Saved User " + i);

        }

    }

}
