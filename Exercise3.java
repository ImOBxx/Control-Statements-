import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.print("Input the 1st number: ");
			int num1 = in.nextInt();
			System.out.print("Inout the 2nd number: ");
			int num2 = in.nextInt();
			System.out.println("Input the 3rd number: ");
			int num3 = in.nextInt();
			if (num1 > num2)
				if (num1 > num3)
					System.out.println("the greatest: " + num1);
			if (num2 > num1)
				if (num2 > num3)
					System.out.println("The greatest: " + num2);
			if (num3 > num1)
				if (num3 > num2)
					System.out.print("The greatest: " + num3);
		}
			

	}

}
