package Org.Grn.Tech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\LENOVO\\eclipse-workspace\\Practice\\driverss\\chromedriver.exe");
		
		WebDriver dri = new ChromeDriver();
		
		dri.get("https://www.facebook.com/");
		
		dri.manage().window().maximize();
		
		String ti = dri.getTitle();
		System.out.println(ti);
		
		String url = dri.getCurrentUrl();
		System.out.println(url);
		
		dri.close();
		
	}
	
	
}
