package session2;

public class shapeutis {

	public static <T extends shape > double calculatearea (T[] shape) {
		double total=0;
		for (T t : shape) {
			total+= t.area();
		}
		return total;
		
	}
	public static <T extends shape> double calculatePerimeter(T[] shape) {
		double total=0;
		for (T t : shape) {
			total+= t.Perimeter();
		}
		return total;
	}
}
