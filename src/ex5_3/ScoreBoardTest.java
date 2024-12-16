package ex5_3;

import junit.framework.TestCase;

public class ScoreBoardTest extends TestCase {

	public void testConstructor() {
		Course c1 = new Course(211, "Database Fundamentals", 3);
		Course c2 = new Course(220, "Basic Programing", 2);
		Course c3 = new Course(690, "Algorithms", 4);
		Course c4 = new Course(721, "Data Structure", 4);

		ILoGrade grades = new ConsLoGrade(new GradeRecord(c1, 7.5), new ConsLoGrade(new GradeRecord(c2, 5.0),
				new ConsLoGrade(new GradeRecord(c3, 7.0), new ConsLoGrade(new GradeRecord(c4, 8.0), new MTLoGrade()))));
		ScoreBoard sb = new ScoreBoard("Tran Van Hoa", "2020", grades);
		System.out.println(sb);

	}

}
