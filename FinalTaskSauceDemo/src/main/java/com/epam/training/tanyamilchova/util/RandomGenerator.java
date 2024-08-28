package com.epam.training.tanyamilchova.util;

import java.util.Random;

public class RandomGenerator {
    public static String getRandomUserName(){
        String[]usernames={"standard_user","locked_out_user","problem_user",
                "performance_glitch_user","error_user","visual_user"};
        Random random = new Random();
        int position= random.nextInt(usernames.length);
        return usernames[position];
    }
}
