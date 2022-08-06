package com.junituc7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	/*
	 * method to check first name
	 */
	public boolean firstName(String firstName) {

		String regex="^[A-Z]{1}[a-z]{3,6}";
		Pattern pattern=Pattern.compile(regex);
		Matcher match=pattern.matcher(firstName);

		return match.matches();

	}

	/*
	 * method to chek last name 
	 */

	public boolean lastName(String lastName) {
		String regex = "^[A-Z]{1}[a-z]{3,6}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}


	/*
	 *  Mathod to check emaile
	 */
	public boolean emailAddress(String email) {
		String regex = "^[a-z]{3}(.+)[a-z]{3}@[bl](.+)[co](.+)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	/*
	 * method to validate mobile number
	 *
	 */
	public boolean phoneNumber(String phoneNumber) {
		String regex = "^(91)?[7-9][0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.matches();
	}

	/*
	 * Method to check rule one minimum 8
	 *Characters - NOTE – All rules must
	 */
	public boolean passwordRule1(String password) {
		String regex = "^^[a-z]{8}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}


	public boolean passwordRule2(String password) {
		String regex = "^^[A-za-z]{8}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();

	}

	public boolean passwordRule3(String password) {
		String regex = "^[A-za-z]{8}[0-9]{1}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();

	}
}
