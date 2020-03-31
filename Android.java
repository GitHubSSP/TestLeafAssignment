package week1.day1;

public class Android {

	//Create a class (Android)
	//Create 5 variables (long, Boolean, String, int , float)
	//Call them from main method and Print the value
	
	long numberOfDownloads = 1000000009L;
	boolean isBeta = false;
	String nameOS = "Oreo";
	int memoryInGBNeeded = 2;
	float versionOS = 8.1F;
	
	public static void main(String[] args) 
	{
		Android myAndroid = new Android();
		
		System.out.println("OS Name " + myAndroid.nameOS);
		System.out.println("OS Version " + myAndroid.versionOS);
		System.out.println("Memory In GB Needed " + myAndroid.memoryInGBNeeded);
		System.out.println("Is It Beta? " + myAndroid.isBeta);
		System.out.println("Number Of Downloads " + myAndroid.numberOfDownloads);
		
		
	}

}
