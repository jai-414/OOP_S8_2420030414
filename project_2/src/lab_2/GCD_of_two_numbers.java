package lab_2;
	import java.util.Scanner;

	public class GCD_of_two_numbers {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first number ");
	        int num_1 = scanner.nextInt();

	        System.out.print("Enter second number ");
	        int num_2 = scanner.nextInt();
	        while (num_2 != 0) {
	            int temp = num_2;
	            num_2 = num_1%num_2;
	            num_1 = temp;
	        }

	        System.out.println("GCD is: " + num_1);

	    }
	}

