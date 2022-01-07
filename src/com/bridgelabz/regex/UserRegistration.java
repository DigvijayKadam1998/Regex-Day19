package com.bridgelabz.regex;

public class UserRegistration {
	public static void main(String[] args) {
		ValidationOfUserRegistration validationOf = new ValidationOfUserRegistration();
		validationOf.validateFirstName("Digvijay");
		validationOf.validateLastName("Kadam");
		validationOf.validateEmailId("digvijaykadam168@gmail.com");
		validationOf.validateMobileNumber("91 9876543210");
		validationOf.validatePasswordRuleOne("Digvijay@)");
		validationOf.validatePasswordRuleTwo("DigVijay@");
		validationOf.validatePasswordRuleThree("DigVijay@11");
	}
}
