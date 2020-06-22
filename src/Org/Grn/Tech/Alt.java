package Org.Grn.Tech;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alt {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Practice\\driverss\\chromedriver.exe");

		WebDriver dri = new ChromeDriver();

		dri.get("http://demo.automationtesting.in/Alerts.html");
					
		WebElement conalert = dri.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		conalert.click();
		
		WebElement clk = dri.findElement(By.xpath("//button[@class = 'btn btn-info']"));
		clk.click();
		
		Thread.sleep(3000);
		
		Alert alert = dri.switchTo().alert();
		
		Thread.sleep(2000);
		
		alert.sendKeys("Fayaz");
		
		Thread.sleep(5000);
		
		alert.accept();	
	}
	
	
}
