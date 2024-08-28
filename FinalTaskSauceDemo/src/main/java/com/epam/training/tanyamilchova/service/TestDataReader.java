package com.epam.training.tanyamilchova.service;

import java.util.ResourceBundle;

public class TestDataReader {
    static {
        System.setProperty("environment", "dev");
    }
    public static ResourceBundle resourceBundle=ResourceBundle.getBundle(System.getProperty("environment"));
    public static String getTestData(String key){
        return resourceBundle.getString(key);
    }

}
