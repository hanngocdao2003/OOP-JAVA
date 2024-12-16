package ex4_4;

public class Circle extends AShape{
	private int radius;

	public Circle(CartPt loc, int radius) {
		super(loc);
		this.setRadius(radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
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
