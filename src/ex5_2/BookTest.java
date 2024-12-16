package ex5_2;

import java.awt.GradientPaint;

import ex5_3.GradeRecord;
import junit.framework.TestCase;

public class BookTest extends TestCase {

	public void testConstructor() {
		Book b1 = new Book("Robinson Crusoe", 15.50, 1719, "Daniel Defoe");
		Book b2 = new Book("Heart of Darkness", 12.80, 1902, "Joseph Conrad");
		Book b3 = new Book("Beach Music", 9.50, 1996, "Pat Conroy");

		IBook empty = new MTBook();
		IBook cons = new ConsBook(b3, empty);
		
		System.out.println(cons);
	}

}
