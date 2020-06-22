package Org.Grn.Tech;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Practice\\driverss\\chromedriver.exe");

		WebDriver dri = new ChromeDriver();

		dri.get("http://www.greenstechnologys.com/");

		dri.manage().window().maximize();

		Thread.sleep(3000);

		WebElement text = dri.findElement(By.xpath("//div[@ id='footer-wrapper']"));

		JavascriptExecutor je = (JavascriptExecutor) dri;

		je.executeScript("arguments[0].scrollIntoView();", text);

		Thread.sleep(3000);

		String tx = text.getText();
		System.out.println(tx);

		WebElement scrlup = dri.findElement(By.xpath("//div[@id = 'head-wrapper']"));

		je.executeScript("arguments[0].scrollIntoView();", scrlup);

		Thread.sleep(2000);

		String scrl2 = scrlup.getText();
		System.out.println(scrl2);

		dri.close();
	}

}
