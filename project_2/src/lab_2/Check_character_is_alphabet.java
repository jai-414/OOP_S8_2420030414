package lab_2;
import java.util.Scanner;
public class Check_character_is_alphabet {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter any character: ");
	        char ch = in.next().charAt(0);

	        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
	            System.out.println("The character you have entered is an alphabet");
	        } else {
	            System.out.println("The character you have entered is not an alphabet");
	        }
	    }
	}


