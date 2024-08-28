package com.epam.training.tanyamilchova.service;

import com.epam.training.tanyamilchova.util.RandomGenerator;
import com.epam.training.tanyamilchova.model.User;


public class UserCreator {
    public static final String USERNAME="testdata.user.username";
    public static final String PASSWORD="testdata.user.password";
    public static final String ALL_USERS_PASSWORD="secret_sauce";

    public static User withCredentialFromProperty(){
        return new User(TestDataReader.getTestData(USERNAME),TestDataReader.getTestData(PASSWORD));
    }
    public static User withEmptyCredential(){
        return new User("","");
    }
    public static User withRandomCredentials(){
        return new User(RandomGenerator.getRandomUserName(),"secret_sauce");
    }
}
