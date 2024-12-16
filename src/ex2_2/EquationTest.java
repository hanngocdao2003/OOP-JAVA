package ex2_2;

import junit.framework.TestCase;

public class EquationTest extends TestCase {
	Equation e1 = new Equation(2, 1, 1);
	Equation e2 = new Equation(4, 1, 5);
	
	
	public void testGetDelta() {
		assertEquals(-4.0, e1.getDelta());
		assertEquals(-64.0, e2.getDelta());
	}

	public void testWhatKind() {
		assertEquals("none", e2.whatKind());
	}
}
