package session2;

public abstract class person {
	
	private String name;
	
	public person(String name) {
		this.name=name;
	}
	public abstract void call();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void worning() {
		System.out.println("hi "+this.getName()+" wake up");
	}
}
