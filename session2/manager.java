package session2;

public class manager extends person {

	public manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		System.out.println(this.getName()+"You have an email");

	}

}
