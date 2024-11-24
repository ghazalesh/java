package session7;

public class country {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public country(String name) {
		super();
		this.name = name;
	}

	public country() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "country [name=" + name + "]";
	}
	

}
