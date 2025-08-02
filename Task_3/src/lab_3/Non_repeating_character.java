package lab_3;

import java.util.Scanner;

public class Non_repeating_character {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(str.indexOf(c)==str.lastIndexOf(c)) {
				System.out.println(c);
				return;
			}
		}
		System.out.println("No repeating element found");
	}
}
