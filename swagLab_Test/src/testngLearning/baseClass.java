package testngLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	
	WebDriver driver; 
	loginPage lp;
	
	public void setupChromeDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\OneDrive\\Desktop\\ProgramingLibraries\\chromedriver_win32 (2)\\chromedriver.exe");	        
	    
		driver = new ChromeDriver();
		 	
	}
	
	public void NavigateToUrl(String url) {
		
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	public void setupPages() {
		
		lp= new loginPage(driver);
		
		
	}
	
	public void quitBrowser() {
		
		driver.quit();
		
	}
	
	
	
	
	
	

}