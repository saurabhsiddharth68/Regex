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

        System.out.println("Enter the email id");
        String eMail = sc.next();
        ur.emailId(eMail);

        System.out.println("Enter the Phone Number");
        String pNo = sc.next();
        ur.phoneNumber(pNo);

        System.out.println("Enter the Password Rule 1");
        String password = sc.next();
        ur.passwordRule1(password);
    }
}
