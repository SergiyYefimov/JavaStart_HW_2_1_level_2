package homeTask8;

import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter point coordinate: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		if (c <= 4)
			System.out.println("This point is in the circle");
		else
			System.out.println("This point is out the circle");
		System.out.println(c);
		input.close();
	}

}
