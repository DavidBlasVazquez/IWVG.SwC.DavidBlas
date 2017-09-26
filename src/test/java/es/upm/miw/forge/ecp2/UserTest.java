package es.upm.miw.forge.ecp2;

import org.junit.Before;


public class UserTest {
	
	private User user;
	
	@Before
	public void before() {
		this.user = new User(1, "Jose", "Sanchez");
	}
	
	/* 
	@test
	public void fullInitials () {
	    assertEquals("J.S.", user.fullInitials());
	}
	*/


}