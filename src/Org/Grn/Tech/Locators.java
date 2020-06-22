package Org.Grn.Tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\LENOVO\\eclipse-workspace\\Practice\\driverss\\chromedriver.exe");
	
	WebDriver dri = new ChromeDriver();
	
	dri.get("https://www.facebook.com/");
	
	dri.manage().window().maximize();
	
	Thread.sleep(2000);
	
	WebElement txtusr = dri.findElement(By.id("email"));
	txtusr.sendKeys("fayaz5u");
	
	String te = txtusr.getAttribute("value");
	System.out.println(te);
	
	WebElement password = dri.findElement(By.id("pass"));
	password.sendKeys("google");
		
	WebElement gttext = dri.findElement(By.xpath("//span[text() = 'Create an account']"));
	String text = gttext.getText();
	System.out.println(text);
	
	WebElement contains = dri.findElement(By.xpath("//div[contains(text(),'connect')]"));
	String contians = contains.getText();
	System.out.println(contians);
	
	WebElement loginbtn = dri.findElement(By.xpath("//input[@value = 'Log In']"));
	loginbtn.click();
	
	Thread.sleep(5000);
	
	//dri.quit();
	
	
}
	
	
}
