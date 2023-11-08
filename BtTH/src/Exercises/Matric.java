package Exercises;
import java.util.Scanner;
public class Matric {
	public static void main(String args[]) {
		java.util.Scanner keyboard = new Scanner(System.in);

//System.out.print
		int a, b;
		do {
			System.out.println("Enter size of matrice A[a,b]");
			System.out.print("a b : ");
			a = keyboard.nextInt();
			b = keyboard.nextInt();
		}while(a <= 0||b<=0);
		
		int size = a*b;
		int[] matric1 = new int[size]; 
		int k = 0;
		for (int i = 1; i<=a; i++) {
			System.out.print("Enter line "+ i +" of matric A: ");
			for (int j = 1; j <= b; j++) {
				matric1[k] = keyboard.nextInt();
				k++;
			}
		}
		
		System.out.println("-----------------------------------");
		int[] matric2 = new int[size]; 
		k = 0;
		for (int i = 1; i<=a; i++) {
			System.out.print("Enter line "+ i +" of matric B: ");
			for (int j = 1; j <= b; j++) {
				matric2[k] = keyboard.nextInt();
				k++;
			}
		}
		
		System.out.println("\tMatrix A:");
		k = 0;
		for (int i = 1; i<=a; i++) {
			for (int j = 1; j <= b; j ++) {
				System.out.print(matric1[k] + " ");
				k++;
			}
			System.out.print("\n");

		}
		System.out.println("\tMatrix B:");
		k = 0;
		for (int i = 1; i<=a; i++) {
			for (int j = 1; j <= b; j ++) {
				System.out.print(matric2[k] + " ");
				k++;
			}
			System.out.print("\n");

		}
		
	}
}
