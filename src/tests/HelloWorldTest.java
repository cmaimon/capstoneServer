package tests;
import code.HelloWorld;
import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
	public HelloWorld hw;
	
	@Before
	public void setUp() {
		hw = new HelloWorld();
	}
	
	@Test
	public void testGetConnection() {
		
	}

	@Test
	public void testExampleQuery() {
		boolean result = hw.exampleQuery();
		assertTrue(result);
	}

}
