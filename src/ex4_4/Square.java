package ex4_4;

public class Square extends AShape{
	private int size;

	public Square(CartPt loc, int size) {
		super(loc);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double distanceToO() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(CartPt point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
