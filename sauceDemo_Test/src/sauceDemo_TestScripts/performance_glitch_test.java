package sauceDemo_TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class performance_glitch_test {

	public static void main(String[] args) {
		
		String userNameDataValid = "performance_glitch_user";
		String passwordData = "secret_sauce";
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\OneDrive\\Desktop\\ProgramingLibraries\\chromedriver_win32 (2)\\chromedriver.exe");	        
	    
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		
		username.sendKeys(userNameDataValid);
		password.sendKeys(passwordData);
		loginButton.click();
		
		String actualUrl = driver.getCurrentUrl();
		
		System.out.println(actualUrl);
		
		
		driver.quit();
		
		

	}

}
