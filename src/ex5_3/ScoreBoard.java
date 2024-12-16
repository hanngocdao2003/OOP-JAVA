package ex5_3;

public class ScoreBoard {
	private String name;
	private String classification;
	private ILoGrade listScore;

	public ScoreBoard(String name, String classification, ILoGrade listScore) {
		super();
		this.name = name;
		this.classification = classification;
		this.listScore = listScore;
	}

	@Override
	public String toString() {
		return "ScoreBoard [name=" + name + ", classification=" + classification + "\n listScore=" + listScore + "]";
	}

}
