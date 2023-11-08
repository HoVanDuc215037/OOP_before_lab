package Exercises;
import java.util.Scanner;
import java.lang.Math;
public class root0fEquation {
//First-degree euqation with one value
	static void fdo() {
		java.util.Scanner keyboard = new Scanner(System.in);
		System.out.println("ax + b = 0");
		float a, b;
		do {
			System.out.print("Enter a (a != 0) :");
			a = keyboard.nextFloat();
		}while(a == 0);
		
		System.out.print("Enter b: ");
		b = keyboard.nextFloat();
		
		System.out.println("Root of equation " + a +"x" + " + " + "(" + b + ")" + " = " +" 0 is "+  -b/a);
		System.out.println("------------------------------------");
	}
//System of first-degree euqation with two valuables
	static void sfdt() {
		java.util.Scanner keyboard = new Scanner(System.in);
		String error = "Error";
		System.out.println("a1x1+b1x2=c1, a2x1+b2x2=c2");
		System.out.print("Enter a1 b1 c1: ");
		float a1 = keyboard.nextFloat();
		float b1 = keyboard.nextFloat();
		float c1 = keyboard.nextFloat();
		System.out.print("Enter a2 b2 c2: ");
		float a2 = keyboard.nextFloat();
		float b2 = keyboard.nextFloat();
		float c2 = keyboard.nextFloat();
		
		if ((a1*b2 - a2*b1 == 0)||(a1*c2 - a2*c1 == 0)||(b1*c2 - b2*c1 == 0)) {
			if ((a1*b2 - a2*b1 == 0)&&(a1*c2 - a2*c1 == 0)&&(b1*c2 - b2*c1 == 0)) {
				if (a1 == 0) {
					System.out.println("Root is "+ c1/b1);
					System.out.println("------------------------------------");
					
					return;
				}
				if (b1 == 0) {
					System.out.println("Root is "+ c1/a1);
					System.out.println("------------------------------------");
					
					return;
				}				
			}
			System.out.println("Error");
			return;
		}else {
			if(a1!= 0) {
				System.out.println("Roots of system equation are " +(a1*c2 - a2*c1)/(a2*b1 - a1*b2)+ 
						" and "+ (c1/a1 - b1*(a1*c2 - a2*c1)/(a1*a2*b1 - a1*a1*b2)));
				return;
			}else {
				System.out.println("Roots of system equation are " + c1/b1+ 
						" and "+ (c2/a2- b2*c1/(b1*a2)));
				return;
		}			
		}
	}
	
//Second-degree euqation with one value
	
	static void sdo() {
	java.util.Scanner keyboard = new Scanner(System.in);
	System.out.println("ax^2 + bx + c = 0");
	System.out.print("Nhap a b c: ");
	float a = keyboard.nextFloat();
	float b = keyboard.nextFloat();
	float c = keyboard.nextFloat();
	
	if (a == 0) {
		if (b==0){
			System.out.println("Error");
		}else {
			System.out.println("Root of equation is "+ c/b);
		}
	}else {
		float D = b*b - 4*a*c;
		if (D==0) {
			System.out.println("Root of equation is " + b/(2*a));
			System.out.println("------------------------------------");

		}else if(D>0) {
			System.out.println("Roots of equation are " +(b - Math.sqrt(D))/(2*a) +
												" and " + (b + Math.sqrt(D))/(2*a) );
			System.out.println("------------------------------------");
			
		}else {
			System.out.println("Roots of equation are " + b/(2*a) + " + " + Math.sqrt(-D)+"i" + 
												" and " + b/(2*a) + " - " + Math.sqrt(-D)+"i");
			System.out.println("------------------------------------");

		}
	}
	}
	
// main
	public static void main(String args[]) {
		java.util.Scanner keyboard = new Scanner(System.in);
	
		short option = 0;
		do {
			do {
			System.out.println("1.First-degree euqation with one value.");
			System.out.println("2.System of first-degree euqation with two value.");
			System.out.println("3.Second-degree euqation with one value.");
			System.out.println("0. Exit");
			System.out.print("\tEnter you option (1, 2, 3): ");
			option = keyboard.nextShort();
			
			}while (option != 0 && option != 1 && option!=2 && option!=3);
			
			switch (option){
				case 1: {
					fdo();
					break;
				}
				case 2: {
					sfdt();
					break;
				}
				case 3: {
					sdo();
					break;
				}
				case 0:{

					break;
				}
				default: break;
			}
		}while(option != 0);
	}

}