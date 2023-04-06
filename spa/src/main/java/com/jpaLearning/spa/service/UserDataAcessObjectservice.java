//this class is to Save users and retrive users
package com.jpaLearning.spa.service;


import com.jpaLearning.spa.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional // this says that each menthod is involved in transantion
public class UserDataAcessObjectservice {

    //create an instance to get the values from a db
    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user){
        entityManager.persist(user);
        return user.getId();
    }

}
/*
* How data source is created ? Thruough SpringBoot AutoConfiguration
* */