package ir.isc.training;

import java.util.Random;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello!");
		hwsitch1();
		hwsitch2();
		printmatrix();
		account ac1= new account(10000);
		ac1.print();
		ac1.withdrawal(9000);
		ac1.print();
		stud();
		
	}
	
	public static void hwsitch1() {
		String myList[] = {"ali","mohammad","hasan","sanaz","ghazale","maniya"};
		Random generator = new Random();
		int i =generator.nextInt(6);
		switch (myList[i]) {
		case "ali","mohammad","hasan":
			System.out.println(myList[i]+" is a man");
			break;
		case "sanaz","ghazale","maniya":
			System.out.println(myList[i]+ " is a woman");
			break;
		default:
			break;
		}
			
	}
	
	public static void hwsitch2() {
		Random generator = new Random();
		int i =generator.nextInt(100);
		int j=i/10;
		switch (j) {
		case 9:
			System.out.println("your score is "+ i +" A ");
			break;
		case 8:
			System.out.println("your score is "+i +" B ");
			break;
		case 7:
			System.out.println("your score is "+i +" C ");
			break;
		case 6:
			System.out.println("your score is "+i +" D ");
			break;
		case 5:
			System.out.println("your score is "+i +" E ");
			break;
		default:
			System.out.println("your score is "+i+" less than 50");
			break;
		}
		
	}
	 
	public static void printmatrix() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("inter a number...");
        int inputNumber = input.nextInt();
        double [][] matrix1 = new double [inputNumber][inputNumber];
        
        for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				Random generator = new Random();
				double randomnumber = generator.nextDouble();
				matrix1[i][j]=randomnumber;
			}
		}
        for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				System.out.println(matrix1[i][j]);
			}
		}
		
		
		
	}
	
	public static void stud() {
		int [] mylist= {90,80,100,20,60,10,77,63};
		for (int i = 0; i < mylist.length; i++) {
			switch (mylist[i]/10) {
			case 9:
				System.out.println(i +" score is "+ mylist[i]+"  A ");
				break;
			case 8:
				System.out.println(i +" score is "+ mylist[i]+"  B ");
				break;
			case 7:
				System.out.println(i +" score is "+ mylist[i]+"  C ");
				break;
			case 6:
				System.out.println(i +" score is "+ mylist[i]+"  D ");
				break;
			default:
				System.out.println(i +" score is "+ mylist[i]+"  score is less than 60 ");
				break;
			}
			
		}
		int max=mylist[0];
		int index=0;
		for (int j = 1; j < mylist.length; j++) {
			if (max<mylist[j]) {
				max=mylist[j];
				index=j;
			} 
		
		}
		System.out.println( mylist[index]+" highest score ");
		
	
	}
}
