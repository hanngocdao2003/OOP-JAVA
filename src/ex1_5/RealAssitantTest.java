package ex1_5;

import junit.framework.TestCase;

public class RealAssitantTest extends TestCase {

	public void testConstructor() {
		Address a1 = new Address(23, "Mapie Street", "Brookline");
		Address a2 = new Address(5, "Joye Road", "Newton");
		Address a3 = new Address(83, "Windslow Road", "Waltham");
		
		new RealAssitant("Ranch", 7, 375000, a1);
		new RealAssitant("Colonial", 9, 450000, a2);
		new RealAssitant("Cape", 6, 235000, a3);
	}

}
