package Exercises;
import java.util.Scanner;
public class Days0fMonth {
	public static void main(String[] args) {
		java.util.Scanner keyboard = new Scanner(System.in);
		String Month[] = {"JANUARY", "JAN", "JAN.", "1",
						"FEBRUARY", "FEB", "FEB.", "2",
						"MARCH", "MAR", "MAR.", "3",
						"APRIL", "APR", "APR.", "4",
						"MAY", "MAY.", "5",
						"JUNE", "JUN", "JUN.", "6",
						"JULY", "JUL", "JUL.", "7",
						"AUGUST", "AUG", "AUG.", "8",
						"SEPTEMBER", "SEP", "SEP.", "9",
						"OCTOBER", "OCT", "OCT.", "10",
						"NOVEMBER", "NOV", "NOV.", "11",
						"DECEMBER", "DEC", "DEC.", "12"}; 
/////////////////////////////////month		
		int i=0;
		String inputMonth;
		short out = 0;
		do {
			System.out.println("Enter your month (.eg: January ,or Jan. ,or Jan ,or 1): ");
			inputMonth = keyboard.nextLine();
			for (i = 0; i < 47; i++) {
				if (inputMonth.toUpperCase().compareTo(Month[i]) == 0) {
					out =1;
					break;
				}
			}
		}while (out != 1);

		short Days;
		if ((0<=i && i<4 )||( 8<=i && i<12 )||( 16<=i && i<18 )||( 23 <= i && i<27 )||( 31<= i && i<35 )||( 43<=i && i<47 )) {
			Days = 31;
		}else if (4<=i && i<8) {
				Days = 28;
		}else Days = 30;
		
/////////////////////////////////year
		int inputYear;
		do {
			System.out.println("Enter your year: ");
			inputYear = keyboard.nextInt();
		}while(inputYear <= 0);
		
		if (inputYear % 4 == 0 && inputYear % 400 == 0 && inputYear % 100 == 0) {
			Days = 29;
		}
////////////////////////////////output
		System.out.println("Number days of "+ inputMonth.toUpperCase() + "/"+ inputYear+" are "+Days+ " days.");
		System.exit(0);
	}
} 
