package averageValue;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		int grade;
		double average;
		int counter = 0;
		
		while(counter < 5) {
			System.out.println("Enter the integer nr " + (counter + 1) + ": ");
			grade = input.nextInt();
			total += grade;
			counter++;
		}
		
		average = total / counter;
		System.out.println("Your average is " + average);
	}
}
