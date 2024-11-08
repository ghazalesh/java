package session2;

public class square implements shape {
	private int side;
	public square(int side) {
		this.side=side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
		return side *4;
	}

}
