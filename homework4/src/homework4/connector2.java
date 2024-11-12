package homework4;



public class connector2 {
	private static connector2 c2;
	private static String text;
	private static int mycounter=0;
	
	private connector2() {
		super();
		text="conected for first time!";
	}
	public static connector2 getinstance()
	{
		if (c2==null) {
			c2=new connector2();
			mycounter+=1;
		}
		System.out.println(mycounter);
		return c2;
	}
	public void conect()
	{
		System.out.println(text);
		
	}

}
