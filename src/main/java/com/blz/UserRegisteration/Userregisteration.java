package com.blz.UserRegisteration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Userregisteration {
    public void firstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher match = pattern.matcher(firstName);
        if (match.find() && match.group().equals(firstName)) {
            System.out.println("valid FirstName");
        } else {
            System.out.println("invalid FirstName");
        }
    }
}
