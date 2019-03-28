package in.javahome.myweb.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest  {
	Calculator cal = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(cal.add(10, 20), 30);
	}

	@Test
	public void testMultiply() {
		assertEquals(cal.multiply(10, 20), 200);
	}
}
