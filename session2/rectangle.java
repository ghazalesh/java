package session2;

public class rectangle implements shape {
	private int length;
	private int width;
	public rectangle(int length,int width) {
		// TODO Auto-generated constructor stub
		this.length=length;
		this.width=width;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
		return (length+width)*2;
	}

}
