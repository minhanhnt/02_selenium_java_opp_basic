package javaBasic;

import java.util.Scanner;
import org.testng.annotations.Test;

public class Topic_04_Operator_Exercise {
//	@Test
	public void TC_01() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		String age = scanner.nextLine();
		System.out.println("After 15 years, age of " + name + " will be " + age);
	}
	
	@Test
	public void TC_02() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping then a = " + a + ", b = " + b);
	}
	
//	@Test
	public void TC_03() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if (a>b) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
