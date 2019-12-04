import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class AuthTest extends TestCase{

	@Test
	public void testisCorrectLoginPassword() {
		assertEquals(true,Auth.isCorrectLoginPassword("meryem","ouzdou"));
	}

	@Test
	public void testisLoginPassword() {
		assertEquals(false,Auth.isCorrectLoginPassword("Hajar","ho"));
	}
	@Test
	public void testisCorrectLogin() {
		assertEquals(true,Auth.isCorrectLogin("meryem","mimie"));
	}
	@Test
	public void testisLogin() {
		assertEquals(false,Auth.isCorrectLogin("mimie","o"));
	}
	
}
