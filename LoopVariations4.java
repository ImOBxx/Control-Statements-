
public class LoopVariations4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int x : nums) {
			System.out.println("Value is: " + x);
			sum += x;
			if(x == 5) break;
			System.out.println("Summation of first 5 elements: " + sum);
		}

	}

}
