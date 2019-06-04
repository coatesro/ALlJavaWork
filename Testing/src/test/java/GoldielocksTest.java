import static org.junit.Assert.*;

import org.junit.Test;

public class GoldielocksTest {
//	@Test
//	public void testy() {
//		
//		fail();
//	}
	
//	@Test
//	public void twoTesty() {
//		System.out.println("hello");
//	}
	@Test
	public void hot() {
		App app = new App();
		assertEquals("Too hot error", "Too hot", app.goldielocks(35));
	}
	@Test
	public void cold() {
		App app = new App();
		assertEquals("Too cold error", "Too cold", app.goldielocks(5));
	}
	@Test
	public void justRight() {
		App app = new App();
		assertEquals("Just right error","Just right", app.goldielocks(15));
	}
}
