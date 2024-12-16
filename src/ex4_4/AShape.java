package ex4_4;

public abstract class AShape implements IShape{
	protected CartPt loc;
	
	public AShape(CartPt loc) {
		super();
		this.loc = loc;
	}

	public double area() {
		return 0;
		
	}

	public double distanceToO() {
		return loc.distantToO();
		
	}

	public boolean contains(CartPt point) {
		return false;
		
	}

	public Square boundingBox() {
		return null;
		
	}
	
	public double perimeter() {
		return 0;
		
	}

}
