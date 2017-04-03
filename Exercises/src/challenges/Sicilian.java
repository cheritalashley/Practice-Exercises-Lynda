package challenges;

import java.util.Scanner;

public class Sicilian extends Pizza{
	Scanner input=new Scanner(System.in);
	
	public Sicilian(){
		super("Sicilian");
	}
	
	public Sicilian(String name){
		super(name);
	}
	
	public double calPrice(){
		System.out.println("Enter the number of Sicilian Pizza: ");
		int num=input.nextInt();
		System.out.println("Enter the number of Regular Pizza: (S,M,L,XL) ");
		String size=input.next();
		System.out.println("Enter the number of Toppings on Pizza: ");
		int toppingsNum=input.nextInt();
			if (toppingsNum>3){
				System.out.println("Number of Toppings must be less than 3");
				System.out.println("Enter the number of Toppings on Pizza: ");
				toppingsNum=input.nextInt();
				}
			
			int myToppings=0;
			String[] toppings=new String[10];
			while(myToppings!=toppingsNum){
				for(int i=0; i<toppings.length; i++){
				System.out.println("Enter the next toppings: ");
				toppings[i]=input.nextLine();
				myToppings++;
				}	
			}
			
		double price=toppingsNum*8.00*num;
		return price;
	} 

}
