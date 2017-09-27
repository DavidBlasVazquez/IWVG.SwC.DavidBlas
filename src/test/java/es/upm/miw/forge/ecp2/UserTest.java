package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.forge.ecp2.User;

public class UserTest {
	
	private User user;
	
	@Before
	public void before() {
		this.user = new User(1, "Jose", "Sanchez");
	}

	@Test
	public void fullInitials () {
	    assertEquals("J.S.", user.fullInitials());
	}


}