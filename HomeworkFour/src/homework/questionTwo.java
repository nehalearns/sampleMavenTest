package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class questionTwo {

		public static void main(String[] args) throws InterruptedException {
			
	//Navigate to the Yahoo sign up page: https://login.yahoo.com/account/create
	//Navigating to the help page, click on the help link on the right top corner of the page, read the title and URL of the page, and print it in the console.
	//In the help page, see the menus on the left side of the page. Validate all the topic if displayed under “Browse BY TOPIC” you can do these:
	//a. Check if each topic is displayed using isdisplayed function.
	//b. Read the text of the topic using getText function and print them in the console.
		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\OneDrive\\Desktop\\ProgramingLibraries\\chromedriver_win32 (2)\\chromedriver.exe");	        
			WebDriver driver = new ChromeDriver();	
			
			driver.get("https://login.yahoo.com/account/create");
			
			WebElement helpLink = driver.findElement(By.linkText("Help"));
			helpLink.click();
			
			String url= driver.getCurrentUrl();
			System.out.println(url);

			String title= driver.getTitle();
			System.out.println(title);

			
		
			WebElement resetPassword = driver.findElement(By.linkText("Reset or change your Yahoo password"));
			Boolean ResetPassword = resetPassword.isDisplayed();
			System.out.println(ResetPassword);

			WebElement fixProblems = driver.findElement(By.linkText("Fix problems signing into your Yahoo account"));
			Boolean FixProblems = resetPassword.isDisplayed();
			System.out.println(FixProblems);

			WebElement fixIssues = driver.findElement(By.linkText("Fix issues with Yahoo Account Key"));
			Boolean FixIssues = resetPassword.isDisplayed();
			System.out.println(FixIssues);

			WebElement setUp = driver.findElement(By.linkText("Set up, use, and manage Yahoo Account Key to sign in without a password"));
			Boolean SetUp = resetPassword.isDisplayed();
			System.out.println(SetUp);
			
			WebElement secure = driver.findElement(By.linkText("Secure your Yahoo account"));
			Boolean Secure = resetPassword.isDisplayed();
			System.out.println(Secure);
			
			WebElement find = driver.findElement(By.linkText("Find and remove unusual activity on your Yahoo account"));
			Boolean Find = resetPassword.isDisplayed();
			System.out.println(Find);
			
			WebElement add = driver.findElement(By.linkText("Add, change, or remove a recovery method"));
			Boolean Add = resetPassword.isDisplayed();
			System.out.println(Add);
			
			WebElement identify = driver.findElement(By.linkText("Identify legitimate Yahoo websites, requests, and communications"));
			Boolean Identify = resetPassword.isDisplayed();
			System.out.println(Identify);
			
			WebElement fix = driver.findElement(By.linkText("Fix problems when a Yahoo website isn't working"));
			Boolean Fix = resetPassword.isDisplayed();
			System.out.println(Fix);
			
			WebElement report = driver.findElement(By.linkText("Report abuse or spam on Yahoo"));
			Boolean Report = resetPassword.isDisplayed();
			System.out.println(Report);
		
			String text1 = resetPassword.getText();
			String text2 = fixProblems.getText();
			String text3 = fixIssues.getText();
			String text4 = setUp.getText();
			String text5 = secure.getText();
			String text6 = find.getText();
			String text7 = add.getText();
			String text8 = identify.getText();
			String text9 = fix.getText();
			String text10 = report.getText();
			
			System.out.println(text1);
			System.out.println(text2);
			System.out.println(text3);
			System.out.println(text4);
			System.out.println(text5);
			System.out.println(text6);
			System.out.println(text7);
			System.out.println(text8);
			System.out.println(text9);
			System.out.println(text10);
			
			
		}

	}
