package javaBasic;

import java.util.Scanner;

public class Topic_01_Variable {
	
	static int studentNumber;
	static boolean statusValue;
	static final String BROWSER_NAME = "Chrome"; // constant
	static int studentPrice;
	
	protected String studentName = "Automation FC";
	
	public static void main(String[] args) {
		int studenPrice = 5;
		System.out.println(studenPrice);
		
		System.out.println(studentNumber);
		System.out.println(statusValue);
		System.out.println(Topic_01_Variable.BROWSER_NAME);
		System.out.println(Topic_01_Variable.statusValue);
		System.out.println(Topic_01_Variable.studentPrice);
		
		Topic_01_Variable topic_1 = new Topic_01_Variable();
		Topic_01_Variable topic_2 = new Topic_01_Variable();
		Topic_01_Variable topic_3 = new Topic_01_Variable();
		
		System.out.println(topic_1.studentName);
		System.out.println(topic_1.BROWSER_NAME); // KhÔng nên dùng kiểu này
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		String age = scanner.nextLine();
		System.out.println("abc " + name + " " + age);
		
		
	}

}

