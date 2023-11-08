package Exercises;
import java.util.Scanner;
public class DisplayTriangle {
	public static void main(String[] args) {
		java.util.Scanner keyboard = new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter your n > 0: ");
			n = keyboard.nextInt();
		}while(n<=0);
		
		for (int i = 0; i<= n; i++) {
			String strTriangleLayer = "";

			for (int j = 0; j < n - i; j++) strTriangleLayer += " ";
			for (int j = n - i; j < n + i -1; j++) strTriangleLayer += "*";
			for (int j = n + i -1; j < 2*n-1; j++) 	strTriangleLayer += " ";
			
			System.out.println(strTriangleLayer);
		}
	
	System.exit(0);
	}
}
