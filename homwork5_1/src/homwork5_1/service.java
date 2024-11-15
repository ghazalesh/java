package homwork5_1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class service {

	private static List<product> products;
		
	
	          
		static {
	        product p1 = new product("moblie", producttype.digital, true, 2500);
	        product p2 = new product("scarf", producttype.garment, false, 20);
	        product p3 = new product("glass", producttype.domestic, true, 260);
	        product p4 = new product("labtop", producttype.digital, false, 6000);
	        product p5 = new product("shoes", producttype.garment, true, 340);
	        product p6 = new product("dish", producttype.domestic, false, 390);
	        product p7 = new product("airpod", producttype.digital, true, 430);
	        product p8 = new product("fork", producttype.domestic, true, 100);
	        product p9 = new product("computer", producttype.digital, true, 7500);
	        
	        products = List.of(p1,p2,p3,p4,p5,p6,p7,p8,p9);
		
	}
	
		public static List<product> findall(){
			products.stream().forEach(t -> System.out.println(t.toString()));
			
			return products;
		}
		
		public static void findbyname(String name){
			
			 products.stream()
			.filter(t -> t.name()
			.equals(name))
			.forEach(t -> System.out.println(t.toString()));
			

		}

		public static void findbytype(producttype type){
	
	
			products.stream()
			.filter(t -> t.type()
			.equals(type))
			.forEach(t -> System.out.println(t.toString()));
			
		}
		
		public static void findbytypeandname(String name ,producttype type){
			
			
			products.stream()
			.filter(t -> t.type()
			.equals(type)).filter(t -> t.name().equals(name))
			.forEach(t -> System.out.println(t.toString()));
			
		}
		
}
