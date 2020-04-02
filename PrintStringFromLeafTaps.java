package week1.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrintStringFromLeafTaps {

	public static void main(String[] args) {

		//Adding the ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		//maximize and Implicit Wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		//Launching the URL and maximize
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		//access and enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");

		//access and enter password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//access and click login
		driver.findElementByClassName("decorativeSubmit").click();

		//Get the text and print
		String welcomeText = driver.findElementByTagName("h2").getText();
		System.out.println(welcomeText);

		System.out.println(welcomeText.split("Welcome")[1].trim());
		
		//System.out.println();
		System.out.println(welcomeText.substring(8));
	}

}
