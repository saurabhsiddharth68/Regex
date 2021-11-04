package com.blz.UserRegisteration;

import java.util.Scanner;
public class RegisterationMain {

    public static void main(String[] args) {
        Userregisteration ur = new Userregisteration();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String fName = sc.next();
        ur.firstName(fName);

        System.out.println("Enter the last name: ");
        String lName = sc.next();
        ur.lastName(lName);
    }
}
