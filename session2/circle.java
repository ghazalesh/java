package session2;

public class circle implements shape {
	private int Radius;
	
	public circle(int r) {
		Radius=r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Radius*Radius*3.14;
	}

	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
		return 3.14*Radius*2;
	}

}
