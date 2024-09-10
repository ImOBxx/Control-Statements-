import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n, sum = 0;
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Input number: ");
			n = in.nextInt();
		}
		System.out.println("The first n natural numbers are : " +n);
		for(i = 1; i <= n; i++)
		{
			System.out.println(i);
			sum+=i;
		}
		System.out.println("The sum of natural Number upto "+n+ " terms : " +sum);
		}

	}


