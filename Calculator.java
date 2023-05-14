import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations op = new Operations();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a and b");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("**********MENU***********");
			System.out.println("Enter 1 for Addition");
			System.out.println("Enter 2 for Subtraction");
			System.out.println("Enter 3 for Multiplication");
			System.out.println("Enter 4 for Division");
			System.out.println("Enter 5 for Square");
			System.out.println("Enter 6 for Cube");
			String option = sc.next();
			switch(option)
			{
			case "1":
				op.add(a, b);
				break;
				
			case "2":
				op.sub(a, b);
				break;
				
			case "3":
				op.multiply(a, b);
				break;
				
			case "4":
				op.div(a, b);
				break;
				
			case "5":
				op.square(a);
				break;
				
			case "6":
				op.cube(a);
				break;
			
			}
		}

	}

}
