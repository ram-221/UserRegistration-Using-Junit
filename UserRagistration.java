package com.urjunittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRagistration {

	public boolean firstName(String firstName) {
		
		String regex="^[A-z]{1}[a-z]*";
		Pattern pattern=Pattern.compile(regex);
		Matcher match=pattern.matcher(firstName);
		
		return match.matches();
		
	}
}
