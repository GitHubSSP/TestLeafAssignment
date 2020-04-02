package week1.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ReverseString {

	public static void main(String[] args) {
		String inputText = "Saravana";
		//char[] reverseText = "";
		String reverseText = "";
		
		for(int index = (inputText.length() - 1); index >=0 ; index--)
		{
			char eachChar = inputText.charAt(index);
			System.out.println(eachChar);
			reverseText = reverseText.concat(Character.toString(eachChar));
		//	System.out.println(" :" + reverseText);
		}
		System.out.println("The reverse of the input string "  + inputText + " is " + reverseText);
	}
}
