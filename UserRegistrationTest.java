package com.urjunittesting;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRagistration userRegistration = new UserRagistration();


	    @Test
	    public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
	        boolean result = userRegistration.firstName("Ramesh");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
	        boolean result = userRegistration.firstName("rames");
	        Assert.assertEquals(false, result);
	    }

}
