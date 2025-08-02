package lab_3;
import java.util.Scanner;
import java.util.Arrays;
public class anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the names u want to check whether it is a anagram or not");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (Arrays.equals(arr1,arr2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not An Anagram");
		}
	}
}