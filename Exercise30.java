import java.util.Scanner;

public class Exercise30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input first number: ");
		int x = in.nextInt();
		System.out.print("Input second number: ");
		int y = in.nextInt();
		System.out.println("Input third number: ");
		int z = in.nextInt();
		if (x == y && x == z)
		{
			System.out.println("All numbers are equal");
		}
		else if ((x == y) || (x == z) || (z == y))
		{
	    System.out.print("Neither all are equal or diffierent");
        }
        else 
        {
        	 System.out.println("All numbers are different");
	    
	
	
		}

	}

}
