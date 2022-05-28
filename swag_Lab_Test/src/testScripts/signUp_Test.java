package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signUp_Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\OneDrive\\Desktop\\ProgramingLibraries\\chromedriver_win32 (2)\\chromedriver.exe");	        
        
		WebDriver driver = new ChromeDriver();	
											
	driver.navigate().to("http://automationpractice.com/index.php");
						
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
	
	WebElement signInLink = driver.findElement(By.linkText("Sign in"));
	signInLink.click();
	
	WebElement emailBox = driver.findElement(By.id("email_create"));
	emailBox.sendKeys("abdhabkuwibufaerj@gmail.com");
	
	WebElement createButton = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
	createButton.click();
	
	WebElement gender1Selection = driver.findElement(By.id("id_gender1"));
	WebElement firstName = driver.findElement(By.name("customer_firstname"));
	WebElement lastName = driver.findElement(By.name("customer_lastname"));
	
	
	gender1Selection.click();
	firstName.sendKeys("John");
	lastName.sendKeys("Smith");
	
	
	}

}
