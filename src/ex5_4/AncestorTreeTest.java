package ex5_4;

import junit.framework.TestCase;

public class AncestorTreeTest extends TestCase {

	public void testConstructor() {
		Person p1 = new Person("Bob", 1917);
		Person p2 = new Person("Angela", 1936);
		Person p3 = new Person("Robert", 1935);
		Person p4 = new Person("Annie", 1938);
		Person p5 = new Person("Janet", 1958);
		Person p6 = new Person("Paul", 1956);
		Person p7 = new Person("Peter", 1980);
		IAncestorTree unknown = new Unknown();
		IAncestorTree bob = new ConsAncestorTree(p1, unknown, unknown);
		IAncestorTree angela = new ConsAncestorTree(p2, unknown, unknown);
		IAncestorTree robert = new ConsAncestorTree(p3, unknown, unknown);
        IAncestorTree annie = new ConsAncestorTree(p4, bob, unknown);
		IAncestorTree janet = new ConsAncestorTree(p5, robert, angela);
        IAncestorTree paul = new ConsAncestorTree(p6, unknown, annie);
        IAncestorTree peter = new ConsAncestorTree(p7, paul, janet);
       
       System.out.println(peter);

	}

}
