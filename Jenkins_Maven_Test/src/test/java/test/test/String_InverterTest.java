package test.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class String_InverterTest {


	@Test
	public void testInvert() {
		String_Inverter invert = new String_Inverter();
		String str = "Hallo Nils!";
		String str2 = invert.invert(str);
		System.out.println(str2);
		assertTrue(str2.equals("!sliN ollaH"));
	}

	@Test
	public void testScream() {
		fail("Not yet implemented");
	}

}
