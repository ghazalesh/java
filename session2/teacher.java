package session2;

public class teacher extends person {

	public teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		System.out.println(this.getName()+"please call me");

	}

}
