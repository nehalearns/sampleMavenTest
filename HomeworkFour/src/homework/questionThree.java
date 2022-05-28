package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class questionThree {

	//3.	Navigate to the following page: https://www.saucedemo.com/
	//User should be able to login to sauce demo page using valid credentials and should not be able to login using invalid credentials. Login using accepted username and password given in the page, after the login, read the title and URL of the page.
	//There are 4 usernames and passwords in the page, create 4 different scripts to validate each type of login.
	
	public static void main(String[] args) throws InterruptedException {
		//Navigate to the following page: https://www.saucedemo.com/
		//Login using accepted user name and password given in the page. After logging in, read the title and URL of the page.
		//There are 4 user names and passwords in the page, create 4 different scripts to validate each type of login.


				System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\OneDrive\\Desktop\\ProgramingLibraries\\chromedriver_win32 (2)\\chromedriver.exe");	        
		        
				WebDriver driver = new ChromeDriver();	
									
			driver.navigate().to("https://www.saucedemo.com/");
			
		WebElement username= driver.findElement(By.name ("user-name"));
		WebElement password= driver.findElement(By.name ("password"));
		WebElement login= driver.findElement(By.name ("login-button"));

		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");

		Thread.sleep(2000);

		login.click();

		String url= driver.getCurrentUrl();
		System.out.println(url);

		String title= driver.getTitle();
		System.out.println(title);




			}

		}