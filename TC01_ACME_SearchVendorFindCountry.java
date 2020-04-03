package week1.day5;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xdgf.usermodel.section.geometry.MoveTo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC01_ACME_SearchVendorFindCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adding the ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		//maximize and Implicit Wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Launching the URL and maximize
		driver.get("https://acme-test.uipath.com/account/login");

		//Enter User Name
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com" + Keys.TAB);
		
		//Enter Pass Word
		driver.findElementById("password").sendKeys("leaf@12");
		
		//Click Login
		driver.findElementById("buttonLogin").click();
		
		//Mouse Over //button[text()[normalize-space()='Vendors']]
		WebElement vendorLink = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
		Actions builder = new Actions(driver);
		builder.moveToElement(vendorLink).perform();
		
		//Click Search for Vendor
		driver.findElementByLinkText("Search for Vendor").click();
		
		//Enter Vendor Name
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		
		//Click Search
		driver.findElementById("buttonSearch").click();
		
		//Get the Country
		System.out.println("The Country which Blue Lagoon Vendor Belongs to is " + driver.findElementByXPath("//table[@class='table']/tbody[1]/tr[2]/td[5]").getText());
		
		//Click LogOut
		driver.findElementByLinkText("Log Out").click();

		//Close WebPage
		driver.close();

	}

}
