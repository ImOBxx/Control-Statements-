
public class breakstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object outer;
		outer for (int i = 0; i < 3; i++) {
			System.out.print("Pass " + i + ": ");
			for(int j = 0; j < 100; j++) {
				if (j == 10) break outer;
				System.out.print(j + " ");
			}
			System.out.println("This will not print");
		}
		System.out.println("Loops complete.");
		
			
			}
		}

	
