package Org.Grn.Tech;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screensht {

	public static WebDriver dri;
	
	private static void tkscrnsht(String name) throws IOException {
	
		TakesScreenshot tk = (TakesScreenshot) dri;
		
		File clck = tk.getScreenshotAs(OutputType.FILE);
	
		File dest = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Org.Grn.Tech\\Report\\"+ name+".png");
		
		FileUtils.copyFile(clck, dest);
	
	}
	
	
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Practice\\driverss\\chromedriver.exe");

		dri = new ChromeDriver();
		
		dri.get("https://www.facebook.com");
		
		tkscrnsht("Launch");
		
		WebElement txtusr = dri.findElement(By.id("email"));
		txtusr.sendKeys("fayaz5u");

		tkscrnsht("Email-ID");
		
		WebElement passwd = dri.findElement(By.id("pass"));
		passwd.sendKeys("fayaz012");

		tkscrnsht("Password");
				
	}

}
