package lab_2;
import java.util.Scanner;
public class Perfect_number {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int s= 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        if (s == n && n != 0) {
            System.out.println("Enteered number is a perfect number.");
        } else {
            System.out.println("Entered number is NOT a perfect number.");
        }

    }
}
