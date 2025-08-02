package lab_2;
import java.util.Scanner;
public class Check_alphabet_is_a_vowel {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter any character: ");
	        char ch = in.next().charAt(0);

	        if ((ch == 'a')||(ch =='e')||(ch =='i')||(ch =='o')||(ch =='u')||(ch =='A')||(ch =='E')||(ch =='I')||(ch =='O')||(ch =='U')) {
	            System.out.println("The character you have entered is an Vowel");
	        } else {
	            System.out.println("The character you have entered is not an Vowel");
	        }
	    }
	}


