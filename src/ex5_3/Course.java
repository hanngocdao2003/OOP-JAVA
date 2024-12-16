package ex5_3;

public class Course {
	private int number;
	private String title;
	private int credits;

	public Course(int number, String title, int credits) {
		super();
		this.number = number;
		this.title = title;
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Course [number=" + number + ", title=" + title + ", credits=" + credits + "]";
	}

}
