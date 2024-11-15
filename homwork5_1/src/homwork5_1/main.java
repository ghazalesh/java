package homwork5_1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		service.findall();
		System.out.println("1");
		service.findbyname("moblie");
		System.out.println("2");
		service.findbytype(producttype.digital);
		System.out.println("3");
		service.findbytypeandname("moblie", producttype.digital);
		System.out.println("name ?");
		Scanner input1 = new Scanner(System.in);
		System.out.println("type ?");
		Scanner input2 = new Scanner(System.in);
		
		producttype t=producttype.valueOf(input2.next());
		
		if (input1 != null && input2 != null ) { 
			service.findbytypeandname(input1.next() , t);
	}
		else if (input1 != null) {
			service.findbyname(input1.next());
		}
		else if(input2 != null)
		{
			service.findbytype(t);
		}
		else
		{
			service.findall();
		}

}
}
