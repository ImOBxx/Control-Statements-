import java.util.Scanner;

public class Execise20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfRows;
		System.out.print("Input number of rows : ");
		try (Scanner in = new Scanner(System.in)) {
			numberOfRows = in.nextInt();
		
		int number = 1;
		for (int row = 1; row <= numberOfRows; row++)
		{
			for (int column = 1; column <= row; column++)
			{
				System.out.print(number + " ");
			number++;
		}
		System.out.println();
		}
	}
	}
}



