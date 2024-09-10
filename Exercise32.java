import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input first floatingpoint number: ");
		double num1 = input.nextDouble();
		System.out.println("Input second  floatingpoint number: ");
		double num2 = input.nextDouble();
		input.close();
		if (Math.abs(num1 - num2) <= 0.01) {
			System.out.println("these numbers are the same.");
		}
		else {
			System.out.println("these numbers are different.");
		}

	}

}
