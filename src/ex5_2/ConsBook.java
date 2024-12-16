package ex5_2;

public class ConsBook implements IBook {
	private Book first;
	private IBook rest;

	public ConsBook(Book first, IBook rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return first + "\n" + rest;
	}
}
