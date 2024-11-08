package session2;

public class main {

	public static void main(String[] args) {
		
		 stud s1=new stud("ghazale ");
		 teacher t1=new teacher("sara ");
		 manager m1=new manager("nazanin ");
		 
		 s1.worning();
		 s1.call();
		 t1.worning();
		 t1.call();
		 m1.worning();
		 m1.call();
		 
		 
		 
		 circle [] c= {new circle(1),new circle(2),new circle(3)};
		 square [] s= {new square(1),new square(2),new square(3)};
		 rectangle [] r= {new rectangle(1,2),new rectangle(2,3),new rectangle(3,4)};
		 double sum=shapeutis.calculatearea(c);
		 System.out.println("circle : "+sum);
		 sum=shapeutis.calculatePerimeter(c);
		 System.out.println("circle : "+sum);
		 
		 sum=shapeutis.calculatearea(s);
		 System.out.println("square : "+sum);
		 sum=shapeutis.calculatePerimeter(s);
		 System.out.println("square : "+sum);
		 
		 sum=shapeutis.calculatearea(r);
		 System.out.println("rectangle : "+sum);
		 sum=shapeutis.calculatePerimeter(r);
		 System.out.println("rectangle : "+sum);
		 
	}
}
