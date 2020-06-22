package Org.Grn.Tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\LENOVO\\eclipse-workspace\\Practice\\driverss\\chromedriver.exe");
		
		WebDriver dri = new ChromeDriver();
		
		dri.get("http://www.greenstechnologys.com/");
		
		dri.manage().window().maximize();
		
		WebElement course = dri.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions acc = new Actions(dri);
		
		acc.moveToElement(course).perform();
		
		Thread.sleep(5000);
		
		WebElement selenium = dri.findElement(By.xpath("//span[text()='Selenium'][1]"));
		
		acc.moveToElement(selenium).perform();
		
		acc.contextClick(selenium).perform();

		acc.doubleClick(selenium).perform();
		
		//selenium.click();
		System.out.println("working");
		
		
		
		
		
	}
	
	
}
