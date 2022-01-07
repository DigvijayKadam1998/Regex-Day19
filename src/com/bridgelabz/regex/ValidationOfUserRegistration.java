package com.bridgelabz.regex;

import java.util.Scanner;

public class ValidationOfUserRegistration {
    Scanner scanner = new Scanner(System.in);
    
    public void validateFirstName(String firstName){
        String regex = "^[A-Z][a-z]{2,}$";
        System.out.println(firstName.matches(regex));
    }

    public void validateLastName(String lastName){
        String regex = "^[A-Z][a-z]{2,}$";
        System.out.println(lastName.matches(regex));

    }

    public void validateEmailId(String emailId){
        String regex = "^[A-Za-z0-9-._]+@+[a-z]+.[a-z]+$";
        System.out.println(emailId.matches(regex));
    }

    public void validateMobileNumber(String mobileNumber){
        String regex = "^[0-9]{2}+ +[0-9]{10}$";
        System.out.println(mobileNumber.matches(regex));
    }

    public boolean validatePasswordRuleOne(String password){
        String regex = "^[A-Za-z0-9.-_@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }
    public void validatePassword(String password){

    }
    public boolean validatePasswordRuleTwo(String password){
        String regex = "^(?=.*[A-Z])[A-Za-z0-9._@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }
}
