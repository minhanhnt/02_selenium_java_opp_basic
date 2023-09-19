package javaBasic;

import org.testng.annotations.Test;

public class Topic_03_Data_Type_Exercise {
	@Test
	public void TC_01() {
		int a = 6;
		int b = 2;
		
		System.out.println("Tong 2 so a va b la " + (a+b));
		System.out.println("Hieu 2 so a va b la " + (a-b));
		System.out.println("Tich 2 so a va b la " + (a*b));
		System.out.println("Thuong 2 so a va b la " + (a/b));
	}
	
	@Test
	public void TC_02() {
		float dai = 7.5f;
		float rong = 3.8f;
		
		System.out.println("Area = " + (dai*rong));
	}
	
	@Test
	public void TC_03() {
		String name = "Automation Testing";
		System.out.println("Hello " + name);
	}

}
