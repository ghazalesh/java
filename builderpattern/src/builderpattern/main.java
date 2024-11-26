package builderpattern;

import builderpattern.house.Builder;

public class main {

	public static void main(String[] args) throws houseexception {
	house h1=	new house.Builder()
		.area(120)
		.price(0)
		.location("mirdamad")
		.room(2)
		.build();
	System.out.println(h1.toString());
	}
	

}
