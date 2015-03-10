package test.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class Hello_WorldTest {
	@Test
	public void testHelloWorld() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddieren() {
		Hello_World world = new Hello_World();
		int a = 5;
		int b = 3;
		int sum = world.addieren(a, b);
		assertTrue(15 == sum);
	}

	@Test
	public void testMulti() {
		Hello_World world = new Hello_World();
		int a = 5;
		int b = 3;
		int mult = world.multi(a, b);
		assertTrue(15 == mult);
		
	}

}
