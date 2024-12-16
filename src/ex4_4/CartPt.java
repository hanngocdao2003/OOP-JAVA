package ex4_4;

public class CartPt {
	private int x;
	private int y;

	public CartPt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distantToO() { // x= 0; y =0
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	public double distanceTo(CartPt point) { //x1y1 x2y2
		return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
	}

	public CartPt translate(int dx, int dy) {// dich chuyen toa do
		return new CartPt(this.x + dx, this.y + dy);
	}

}
