package Org.Grn.Tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drdp {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\LENOVO\\eclipse-workspace\\Practice\\driverss\\chromedriver.exe");
		
		WebDriver dri = new ChromeDriver();
		
		dri.get("http://demo.guru99.com/test/drag_drop.html");
		
		dri.manage().window().maximize();
		
		Thread.sleep(4000);		
		WebElement src = dri.findElement(By.xpath("//li[@data-id='2']"));
		WebElement des = dri.findElement(By.id("amt8"));
		
		Actions act = new Actions(dri);
		act.dragAndDrop(src, des).perform();
		
		
		
		
	}

}
