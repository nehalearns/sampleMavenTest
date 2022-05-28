package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationLoginValidation {

	public static void main(String[] args) throws InterruptedException {
		
	//Navigate to the following page: http://automationpractice.com/index.php?controller=authentication&back=my-account
	//A user should be able to login using the newly created account information. Validate if you can login using newly created account from task 5.

System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\OneDrive\\Desktop\\ProgramingLibraries\\chromedriver_win32 (2)\\chromedriver.exe");	        
				        
	WebDriver driver = new ChromeDriver();	
										
driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
					
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		
  
WebElement username= driver.findElement(By.name("email"));
WebElement password= driver.findElement(By.name("passwd"));

username.sendKeys("neha.hossain12345678910@gmail.com");
password.sendKeys("dookiesMaster123.");

WebElement signIn= driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
signIn.click();

Thread.sleep(3000);
	}

}
