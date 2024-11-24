package session7;

public class department {
	
	
	private String name;
	private int id;

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "department [name=" + name + ", id=" + id + " ]";
	}
	public department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
