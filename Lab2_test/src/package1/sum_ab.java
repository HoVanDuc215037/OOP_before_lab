package package1;
import java.util.Scanner;
public class sum_ab {
	public static void main(String args[]) {
		java.util.Scanner keyboard = new Scanner(System.in);
		System.out.print("a b: ");
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = a + b;
		System.out.println(a + " + " + b + " = " + c);
	}
}
