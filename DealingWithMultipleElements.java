package week2.day2;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DealingWithMultipleElements {

	public static void main(String[] args) throws IOException {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Implicit Wait and Maximize
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/home.html");

		//Click on Image
		driver.findElementByXPath("//img[@alt='Images']").click();

		//Find out how many images are available, 
		List<WebElement> allImages = driver.findElementsByTagName("img");
		System.out.println("Total Images present @ " + driver.getTitle() + " is : " + allImages.size());


		//2.Click the last image by using the key board buttons
		WebElement lastImage = allImages.get(allImages.size()-1);
		Actions builder = new Actions(driver);
		builder.moveToElement(lastImage).click().perform();


		//3.Go to radio buttons, find how many radio buttons
		driver.navigate().to("http://leafground.com/home.html");
		driver.findElementByXPath("//h5[text()='Radio Button']").click();
		
		List<WebElement> allRadioButtons = driver.findElementsByXPath("//input[@type='radio']");
		System.out.println("Total Radio Buttons: " + allRadioButtons.size());


		//4.Go to the check box, check all the check box(Mark/select all the check box ) using findElement
		driver.navigate().to("http://leafground.com/home.html");
		driver.findElementByXPath("//h5[text()='Checkbox']").click();
		
		List<WebElement> allCheckBoxes = driver.findElementsByXPath("//input[@type='checkbox']");
		for ( WebElement eachCheckBox : allCheckBoxes ) {
			if(!eachCheckBox.isSelected())
			{
				eachCheckBox.click();
			}
		}
		System.out.println("Selected/Marked all Check Boxes");
		
		driver.close();
		//Process p = Runtime.getRuntime().exec("taskkill /IM \"chromedriver.exe\" /F");
		//p.destroy();
	}

}