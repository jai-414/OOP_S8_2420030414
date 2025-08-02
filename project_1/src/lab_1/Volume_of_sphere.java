package lab_1;

import java.util.Scanner;
	public class Volume_of_sphere {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the radius of the sphere");
	        double radius=sc.nextDouble();
	        double Volume=4.0/3.0*3.14*radius*radius*radius;
	        System.out.println("Volume is:"+Volume );

	    }
	}


