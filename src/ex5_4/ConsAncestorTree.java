package ex5_4;

public class ConsAncestorTree implements IAncestorTree {
	private Person person;
	private IAncestorTree father;
	private IAncestorTree mother;

	public ConsAncestorTree(Person person, IAncestorTree father, IAncestorTree mother) {
		super();
		this.person = person;
		this.father = father;
		this.mother = mother;
	}

	@Override
	public String toString() {
		return "ConsAncestorTree [person=" + person + "\n father=" + father + "\n mother=" + mother + "]";
	}

}
