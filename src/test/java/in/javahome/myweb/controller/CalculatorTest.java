package in.javahome.myweb.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest  {
	

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		assertEquals(cal.add(10, 20), 30);
	}

	@Test
	public void testMultiply() {
		Calculator cal = new Calculator();
		assertEquals(cal.multiply(10, 20), 200);
	}
}
