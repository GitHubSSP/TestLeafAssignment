package week1.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLink {

	public static void main(String[] args) {

		//Adding the ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		//maximize and Implicit Wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Launching the URL and maximize
		driver.get("http://www.leafground.com/pages/Link.html");

		//Launching the URL and maximize
		driver.findElementByPartialLinkText("am").click();


		System.out.println(driver.getTitle());
	}

}
