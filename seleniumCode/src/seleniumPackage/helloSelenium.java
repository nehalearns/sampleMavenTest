package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloSelenium {

	public static void main(String[] args) throws InterruptedException {
	//property location set is correct on this one	
// setup the location of the driver
System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\OneDrive\\Desktop\\ProgramingLibraries\\chromedriver_win32 (2)\\chromedriver.exe");	        
// declaring and initializing the web driver object named driver
			
// going to open up a browser instance
		WebDriver driver = new ChromeDriver();	
			
		WebDriver driver1 = new ChromeDriver();
			
// navigate to an url 
			
		driver.navigate().to("https://www.yahoo.com/");
			
// driver.get("https://www.yahoo.com/");
			
		driver1.get("https://www.google.com/");
			
		Thread.sleep(3000);
			
			
	    driver.quit();
			
		driver1.quit();
			
				
		
	}

}
