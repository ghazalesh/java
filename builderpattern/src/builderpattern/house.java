package builderpattern;

public class house {
    private int room;
    private int area;
    private int price;
    private String location;
    
    
	private house(Builder builder) {
		this.room = builder.room;
		this.area = builder.area;
		this.price = builder.price;
		this.location = builder.location;
		
		
	}
	
	
    
    public int getRoom() {
		return room;
	}



	public void setRoom(int room) {
		this.room = room;
	}



	public int getArea() {
		return area;
	}



	public void setArea(int area) {
		this.area = area;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public static class Builder
    {
    	 private int room;
    	    private int area;
    	    private int price;
    	    private String location;
    	   
    	    
    	    public Builder area(int area)
    	    {
    	    	this.area=area;
				return this;
    	    	
    	    }
    	    public Builder room(int room)
    	    {
    	    	this.room=room;
				return this;
    	    	
    	    }
    	    public Builder location(String location)
    	    {
    	    	this.location=location;
				return this;
    	    	
    	    }
    	    public Builder price(int price)
    	    {
    	    	this.price=price;
				return this;
    	    	
    	    }
    	    public house build()throws houseexception {
    	    	if(price == 0)
    	    	{
    	    		throw new houseexception("price cant zero");
    	    		
    	    	}
				return (new house(this));
    	    	
    	    }
    }



	@Override
	public String toString() {
		return "house [room=" + room + ", area=" + area + ", price=" + price + ", location=" + location + "]";
	}
	
    
}
