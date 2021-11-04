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
    public String lastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher match = pattern.matcher(lastName);
        if(match.find() && match.group().equals(lastName)) {
            System.out.println("valid LastName");
        }
        else {
            System.out.println("invalid lastName");
        }
        return lastName;
    }
    public String emailId(String emailId) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]*[a-zA-Z0-9]?@[a-zA-Z0-9]+.([.][a-zA-Z]+)+$");
        Matcher match = pattern.matcher(emailId);
        if(match.find() && match.group().equals(emailId)) {
            System.out.println("valid Email");
        }
        else {
            System.out.println("invalid Email");
        }
        return emailId;
    }
    public String phoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^(\\d{1,2}?)[- .]?\\d{9,10}$");
        Matcher match = pattern.matcher(phoneNumber);
        if(match.find() && match.group().equals(phoneNumber)) {
            System.out.println("valid phoneNumber");
        }
        else {
            System.out.println("invalid phoneNumber");
        }
        return phoneNumber;
    }
}
