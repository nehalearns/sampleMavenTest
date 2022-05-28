package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticePartTwo {

	public static void main(String[] args) throws InterruptedException {
//Navigate to the following page: http://automationpractice.com/index.php?controller=authentication&back=my-account
//A user should be able to sign up for a new account using an email address for the automation practice website.
//Hints: provide an email address and click on create an account button. Once you are in the sign-up page,
//provide all your info and fill out the form and register for a new account. Validate if the registration is successful or not.

	System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\OneDrive\\Desktop\\ProgramingLibraries\\chromedriver_win32 (2)\\chromedriver.exe");	        
	        
		WebDriver driver = new ChromeDriver();	
							
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement emailCreate= driver.findElement(By.name("email_create"));
		emailCreate.sendKeys("neha.hossain12345678910@gmail.com");
		
		Thread.sleep(1000);
		
		WebElement createButton= driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		createButton.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement gender2Selection = driver.findElement(By.id("id_gender2"));
		gender2Selection.click();
		
		WebElement firstname = driver.findElement(By.id("customer_firstname")); 
		WebElement lastname = driver.findElement(By.id("customer_lastname")); 
		WebElement email = driver.findElement(By.id("email")); 
		WebElement password = driver.findElement(By.id("passwd")); 
		
		
		WebElement days = driver.findElement(By.name("days")); 
		WebElement months = driver.findElement(By.name("months")); 
		WebElement years = driver.findElement(By.name("years")); 
		
		WebElement newsletter = driver.findElement(By.name("newsletter")); 
		WebElement specialOffers = driver.findElement(By.name("optin")); 
		WebElement addressFirstname= driver.findElement(By.name("firstname")); 
		WebElement addressLastname = driver.findElement(By.name("lastname")); 
		WebElement companyName = driver.findElement(By.name("company")); 
		WebElement address1 = driver.findElement(By.name("address1"));
		WebElement address2 = driver.findElement(By.name("address2")); 
		WebElement city = driver.findElement(By.name("city")); 
		WebElement state = driver.findElement(By.id("id_state"));
		WebElement zipcode = driver.findElement(By.name("postcode"));
		WebElement country = driver.findElement(By.name("id_country"));
		WebElement additionalInfo = driver.findElement(By.name("other"));
		WebElement homePhone = driver.findElement(By.name("phone"));
		WebElement mobilePhone = driver.findElement(By.name("phone_mobile"));
		WebElement alias = driver.findElement(By.name("alias"));
		WebElement Register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
		 
		
		
		firstname.sendKeys("Neha");
		lastname.sendKeys("Hossain");
		//email.sendKeys("nehahossain123456789@gmail.com");
		password.sendKeys("dookiesMaster123.");
		
		
		Select birthday = new Select(days);
		birthday.selectByValue("13");
		
		Select birthmonth = new Select(months);
		birthmonth.selectByValue("3");
		
		Select birthyear = new Select(years);
		birthyear.selectByValue("1999");
		
		
		newsletter.click();
		specialOffers.click();
		addressFirstname.sendKeys("Neha");
		addressLastname.sendKeys("Hossain");
		companyName.sendKeys("Dookie Company");
		address1.sendKeys("34 Warsaw St");
		address2.sendKeys("Apt 2");
		city.sendKeys("Buffalo");
		
		Select theState = new Select(state);
		theState.selectByValue("32");
	
		zipcode.sendKeys("14206");
		
		Select theCountry = new Select(country);
		theCountry.selectByValue("21");
		
		additionalInfo.sendKeys("None at this time");
		homePhone.sendKeys("3470000000");
		mobilePhone.sendKeys("3470000000");
		alias.sendKeys("15 Linden St");
			
		Thread.sleep(3000);
		 
		Register.click();
	
		
		
	}

}
