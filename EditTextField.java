package week1.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTextField {

	public static void main(String[] args) {

		//Adding the ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		//maximize and Implicit Wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Launching the URL and maximize
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		//type in
		driver.findElementById("email").sendKeys("Saravana");
		
		//to append and Tab Key
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("Saravana" + Keys.TAB);
		
		//get the value already in the text field
		String attribute = driver.findElementByName("username").getAttribute("value");
		System.out.println(attribute);
	
		//get the value already in the text field
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
				
		//Check if the field is disabled or not
		System.out.println("Is the field Enabled? " + driver.findElementByXPath("//label[text()='Confirm that edit field is disabled']/following-sibling::input").getAttribute("disabled"));
					
		//Check if the field is disabled or not
		System.out.println("Is the field Disabled? " + driver.findElementByXPath("//input[@disabled='true']").isEnabled());
		
		driver.close();
	}

}
