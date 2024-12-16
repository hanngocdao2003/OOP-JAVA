package ex2_2;

public class Equation {
	double a;
	double b;
	double c;

	public Equation(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	double getDelta() {
		return Math.pow(a, 2) - (4 * a * c);
	}

	String whatKind() {
		String result = "";
		if (a == 0) {
			result = "degenerate";
		} else { // a != 0
			if (getDelta() < 0) {
				result = "none";
			} else if (getDelta() > 0) {
				result = "two";
			} else {
				result = "one";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Equation e = new Equation(2,1,1);
		System.out.println(e.getDelta());
		System.out.println(e.whatKind());
	}
}
