package ex5_3;

public class ConsLoGrade implements ILoGrade {
	private GradeRecord first;
	private ILoGrade rest;

	public ConsLoGrade(GradeRecord first, ILoGrade rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	@Override
	public String toString() {
		return "ConsLoGrade [first=" + first + "\nrest=" + rest + "]";
	}

}
