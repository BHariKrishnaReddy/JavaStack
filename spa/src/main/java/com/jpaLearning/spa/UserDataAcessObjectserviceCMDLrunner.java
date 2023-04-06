package com.jpaLearning.spa;

import com.jpaLearning.spa.entity.User;
import com.jpaLearning.spa.service.UserDataAcessObjectservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDataAcessObjectserviceCMDLrunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDataAcessObjectserviceCMDLrunner.class);

    @Autowired
    private UserDataAcessObjectservice userDataAcessObjectservice;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack","Admin"); //to save this we need UserDataAcessObjectservice
        long insert = userDataAcessObjectservice.insert(user); // to log we need logger function.
        log.info("New User is Created "+ user);
    }
}

//    CommandLineRunner is implement inthis class because we want this to run when SpringApplication starts.
//        UserDataAcessObjectservice which allows us to insert user
