package week1.day5;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xdgf.usermodel.section.geometry.MoveTo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC02_RedBusSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Adding the ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		//maximize and Implicit Wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Launching the URL
		driver.get("https://www.redbus.in/");

		//Enter Source
		driver.findElementById("src").sendKeys("Chennai");
		Thread.sleep(5000);
		driver.findElementById("src").sendKeys(Keys.ENTER);

		//Enter Destination
		driver.findElementById("dest").sendKeys("Bangalore");
		Thread.sleep(5000);
		driver.findElementById("dest").sendKeys(Keys.ENTER);

		//Click on OnWard Date
		driver.findElementById("onward_cal']").click();

		//Click Current day
		//driver.findElementByXPath("(//td[@class='current day'])[2]").click();

		Thread.sleep(3000);

		//Select April 30
		driver.findElementByXPath("(//td[text()='30'])[2]").click();

		//Click Search
		driver.findElementById("search_btn").click();

		//Select before 6AM
		driver.findElementByXPath("(//label[@for='dtBefore 6 am'])[1]").click();

		//Select Sleeper
		driver.findElementByXPath("(//label[@for='bt_SLEEPER'])[1]").click();

		//Click Sort on Seats Available
		//driver.findElementByXPath("(//div[contains(@class,'w-15 fl')]//a)[2]").click();

		driver.findElementByLinkText("Seats Available").click();
		
		//Close WebPage
		//driver.close();
		System.out.println("Test Case Successfully Executed");
	
	}

}
