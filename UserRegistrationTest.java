package com.junituc9;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {


    UserRegistration userRegistration = new UserRegistration();


    @Test
    public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Ramesh");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("ramesh");
        Assert.assertEquals(false, result);
    }
    
    /*
     * method to check Last name
     */

    @Test
    public void givenLastName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Ramrs");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("rames");
        Assert.assertEquals(false, result);
    }
    
    /*
	 * methods to check mail addresss
	 */
    
        @Test
    	public void givenEmail_WhenInFormat_ShouldReturnTrue() {
    		boolean result = userRegistration.emailAddress("Rameshc@bl.co.in");
    		Assert.assertEquals(true, result);
    	}

    	@Test
    	public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
    		boolean result = userRegistration.emailAddress("abc()*@gmail.com");
    		Assert.assertEquals(false, result);
    }
    
    	/*
    	 * test cases for mobile number validation
    	 */
    	@Test
    	public void givenPhoneNumber_WhenInFormat_ShouldReturnTrue() {
    		boolean result = userRegistration.phoneNumber("918431510221");
    		Assert.assertEquals(true, result);
    	}

    	@Test
    	public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() {
    		boolean result = userRegistration.phoneNumber("+91 9060670390");
    		Assert.assertEquals(false, result);
    	}

    	/*
    	 * method to validate password
    	 */
    	@Test
    	public void givenPassword_WhenInFormat_ShouldReturnTrue() {
    		boolean result = userRegistration.passwordRule1("abcdegfhij");
    		Assert.assertEquals(true, result);
    	}
    	@Test
    	public void givenPassword_WhenOurOfFormat_ShouldReturnFalse() {
    		boolean result = userRegistration.passwordRule1("abcd");
    		Assert.assertEquals(false, result);
    	}
    	@Test
    	public void givenPasswordRule2_WhenInFormat_ShouldReturnTrue() {
    		boolean result = userRegistration.passwordRule2("Abcdefghij");
    		Assert.assertEquals(true, result);
    	}

    	@Test
    	public void givenPasswordRule2_WhenOurOfFormat_ShouldReturnFalse() {
    		boolean result = userRegistration.passwordRule2("abcdefghij");
    		Assert.assertEquals(false, result);
    	}
    	  @Test
  	    public void givenPasswordRule3_WhenInFormat_ShouldReturnTrue() {
  	        boolean result = userRegistration.passwordRule3("Ramesh2");
  	        Assert.assertEquals(true, result);
  	    }

  	    @Test
  	    public void givenPasswordRule3_WhenOurOfFormat_ShouldReturnFalse() {
  	        boolean result = userRegistration.passwordRule3("Rameshc");
  	        Assert.assertEquals(false, result);
  	    }

  	  @Test
	    public void givenPasswordRule4_WhenInFormat_ShouldReturnTrue() {
	        boolean result = userRegistration.passwordRule4("Ramesh@221");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenPasswordRule4_WhenOurOfFormat_ShouldReturnFalse() {
	        boolean result = userRegistration.passwordRule4("Ramesh");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenEmail1_WhenInFormat_ShouldReturnTrue() {
	        boolean result = userRegistration.emailAddressSample("abc1@yahoo.com");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenEmail1_WhenOurOfFormat_ShouldReturnFalse() {
	        boolean result = userRegistration.emailAddressSample("@yahoo.com");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenEmail2WhenInFormat_ShouldReturnTrue() {
	        boolean result = userRegistration.emailAddressSample("abc-100@yahoo.com");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenEmail2_WhenOurOfFormat_ShouldReturnFalse() {
	        boolean result = userRegistration.emailAddressSample("abc123@.com");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenEmail3_WhenInFormat_ShouldReturnTrue() {
	        boolean result = userRegistration.emailAddressSample("abc.100@abc.com.au");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenEmail3_WhenOurOfFormat_ShouldReturnFalse() {
	        boolean result = userRegistration.emailAddressSample("abc()*@gmail.com");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenEmail4_WhenInFormat_ShouldReturnTrue() {
	        boolean result = userRegistration.emailAddressSample("abc@1.com");
	        Assert.assertEquals(true, result);
	    }
	    @Test
	    public void givenEmail4_WhenOurOfFormat_ShouldReturnFalse() {
	        boolean result = userRegistration.emailAddressSample("aabc.@gmail.com");
	        Assert.assertEquals(false, result);
	    }
}
