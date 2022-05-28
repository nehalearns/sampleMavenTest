package homework;


//1. User should be able to create new account by filling out the yahoo sign up form. 
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
		
public class questionOne {

	public static void main(String[] args) throws InterruptedException {
				
		//Fill out the Yahoo sign up form. 
		//Read what is written in the button, but DO NOT click on the CONTINUE button.
		//Print the value in the Eclipse console. If you automate the function to click the button, the application can block you detecting that your automated code is trying to create account. 

			System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\OneDrive\\Desktop\\ProgramingLibraries\\chromedriver_win32 (2)\\chromedriver.exe");	        
		        
			WebDriver driver = new ChromeDriver();	
								
		driver.navigate().to("https://login.yahoo.com/account/create");

		driver.findElement(By.name("firstName")).sendKeys("Neha");
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Hossain");
		driver.findElement(By.id("usernamereg-yid")).sendKeys("neha_hossain");
		driver.findElement(By.id("usernamereg-password")).sendKeys("TrueDookieMaster123.");
		driver.findElement(By.id("usernamereg-phone")).sendKeys("3478008900");

		WebElement birthMonth = driver.findElement(By.id("usernamereg-month"));
		Select bm = new Select (birthMonth);
		bm.selectByValue("4");

		driver.findElement(By.id("usernamereg-day")).sendKeys("13");

		driver.findElement(By.id("usernamereg-year")).sendKeys("1999");

		driver.findElement(By.name("freeformGender")).sendKeys("Female");


		WebElement Continuebutton = driver.findElement(By.name("signup"));
		String text= Continuebutton.getText();
		System.out.println(text);

		Thread.sleep(2000);

		String url= driver.getCurrentUrl();
		System.out.println(url);

		String title= driver.getTitle();
		System.out.println(title);

		Thread.sleep(2000);
		driver.quit();					
				
				

			}


	}

