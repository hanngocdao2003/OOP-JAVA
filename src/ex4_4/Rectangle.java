package ex4_4;

public class Rectangle extends AShape {
	private int height;
	private int width;

	public Rectangle(CartPt loc, int height, int width) {
		super(loc);
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.height * this.width;
	}

	@Override
	public double distanceToO() {
		// TODO Auto-generated method stub
		return super.distanceToO();
	}

	@Override
	public boolean contains(CartPt point) {
		// loc.getX<=point.getX<=loc.getX+width
		// loc.getX = 2
		// point.getX = 4
		// width = 4
		// 2<=4<=2+4
		return this.between(point.getX(), this.loc.getX() + this.width, this.loc.getX())
				&& this.between(point.getY(), this.loc.getY() + this.height, this.loc.getY());
	}

	// ktra low<=value<=high
	private boolean between(int value, int high, int low) {
		return value >= low && value <= high;
	}

	@Override
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return super.boundingBox();
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (this.height + this.width) * 2;
	}
}
