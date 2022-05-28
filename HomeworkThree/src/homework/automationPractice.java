package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\OneDrive\\Desktop\\ProgramingLibraries\\chromedriver_win32 (2)\\chromedriver.exe");	        
        
		WebDriver driver = new ChromeDriver();	
							
		driver.navigate().to("http://automationpractice.com/index.php");

WebElement specials= driver.findElement(By.linkText("Specials"));
//WebElement newProducts= driver.findElement(By.linkText("New products"));
//WebElement bestSellers= driver.findElement(By.linkText("Best sellers"));
//WebElement ourStores= driver.findElement(By.linkText("Our stores"));
//WebElement contactUs= driver.findElement(By.linkText("Contact us"));
//WebElement termsAndCond= driver.findElement(By.linkText("Terms and conditions of use"));
//WebElement aboutUs= driver.findElement(By.linkText("About us"));
//WebElement sitemaps= driver.findElement(By.linkText("Sitemap"));





specials.click();
String url1 = driver.getCurrentUrl();
String title1 = driver.getTitle();

System.out.println(url1);
System.out.println(title1);

driver.navigate().back();

WebElement newProducts= driver.findElement(By.linkText("New products"));

newProducts.click();
String url2= driver.getCurrentUrl();
String title2 = driver.getTitle();

System.out.println(url2);
System.out.println(title2);

driver.navigate().back();

WebElement bestSellers= driver.findElement(By.linkText("Best sellers"));
bestSellers.click();
String url3= driver.getCurrentUrl();
String title3 = driver.getTitle();

System.out.println(url3);
System.out.println(title3);

driver.navigate().back();

WebElement ourStores= driver.findElement(By.linkText("Our stores"));
ourStores.click();

String url4= driver.getCurrentUrl();
String title4 = driver.getTitle();

System.out.println(url4);
System.out.println(title4);

driver.navigate().back();

WebElement contactUs= driver.findElement(By.linkText("Contact us"));
contactUs.click();
String url5= driver.getCurrentUrl();
String title5 = driver.getTitle();

System.out.println(url5);
System.out.println(title5);

driver.navigate().back();

WebElement termsAndCond= driver.findElement(By.linkText("Terms and conditions of use"));
termsAndCond.click();
String url6= driver.getCurrentUrl();
String title6 = driver.getTitle();

System.out.println(url6);
System.out.println(title6);

driver.navigate().back();

WebElement aboutUs= driver.findElement(By.linkText("About us"));
aboutUs.click();
String url7= driver.getCurrentUrl();
String title7 = driver.getTitle();

System.out.println(url7);
System.out.println(title7);

driver.navigate().back();

WebElement sitemaps= driver.findElement(By.linkText("Sitemap"));
sitemaps.click();
String url8= driver.getCurrentUrl();
String title8 = driver.getTitle();

System.out.println(url8);
System.out.println(title8);

driver.navigate().back();



	}

}


