package javaBasic;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;

public class Topic_02_Data_Type {

	public static void main(String[] args) {
		// I_Primitive type/ value type: Nguyên Thủy
		byte bNumber = 6;
		short sNumber = 1500;
		int iNumber = 65000;
		long lNumber = 65000;
		float fNumber = 15.98f;
		double dnumber = 15.98d;
		char cChar = '1';
		boolean bStatus = false;
		
		// II_Reference type: Tham chiếu
		
		// String
		String address = "HCM";
		
		// Array
		String[] studentAddress = {"HN", "DN"};
		Integer[] studentNumber = {15,20,50};
		
		// Class
		Topic_02_Data_Type topic;
		
		// Interface
		WebDriver driver = null;
		
		// Object
		Object aObject;

		// Collection
		// List/Set/Queue/Map
		List<WebElement> homePageLinks = driver.findElements(By.tagName("a"));
		Set<String> allWindows = driver.getWindowHandles();
		List<String> productName = new ArrayList<String>();

		
	}

}
 