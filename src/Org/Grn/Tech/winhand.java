package Org.Grn.Tech;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class winhand {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Practice\\driverss\\chromedriver.exe");

		WebDriver dri = new ChromeDriver();
		
		dri.get("https://www.flipkart.com/");
		
		Robot boot = new Robot();
		
		boot.keyPress(KeyEvent.VK_ESCAPE);
		boot.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(5000);
		
		WebElement searchbox = dri.findElement(By.xpath("//input[@name ='q']"));
		searchbox.click();
		
		searchbox.sendKeys("Laptops");
		
		boot.keyPress(KeyEvent.VK_ENTER);
		boot.keyRelease(KeyEvent.VK_ENTER);
		
		dri.manage().window().maximize();

		WebElement pro = dri.findElement(By.xpath("//div[contains(text(),'23,990')]"));
		
		pro.click();
		
		String par = dri.getWindowHandle();
		Set<String> all = dri.getWindowHandles();
		
		for(String x : all) {
			if(par.equals(x)) {
				dri.switchTo().window(x);
							}
		}
		System.out.println(par);
		System.out.println(all);
		Thread.sleep(5000);
		
		
		
		
	}
	
	
}
