package Exercises;
import java.util.Arrays;
import java.util.Scanner;
public class numArr {
	public static void main(String[] args) {
		int sum = 0;
		int size;
		java.util.Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Enter your array's size ");
			size = keyboard.nextInt();
		}while(size <= 0);
		System.out.println("Enter your array: ");
		int [] arr = new int[size];
		for (int i = 0; i< size ; i++) {
			int x = keyboard.nextInt();
			arr[i] = x;
		}
		
		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}
		Arrays.sort(arr);
		System.out.println("Sum of array is " + sum);
		System.out.println("Average of array is " + sum/size);
		System.out.print("Sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
