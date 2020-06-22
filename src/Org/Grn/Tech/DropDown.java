package Org.Grn.Tech;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Practice\\driverss\\chromedriver.exe");

		WebDriver dri = new ChromeDriver();

		dri.get("https://www.facebook.com");

		WebElement month = dri.findElement(By.id("month"));

		Select sel = new Select(month);

		sel.selectByValue("4");
		
		boolean mul = sel.isMultiple();

		System.out.println(mul);
		
		List<WebElement> count = sel.getOptions();

		System.out.println(count.size());

	
		for(int i = 0; i <count.size(); i++) {
			WebElement x = count.get(i);
			String tx = x.getText();
			System.out.println(tx);
			}
	for(WebElement y : count) {
		String attribute = y.getAttribute("value");
		System.out.println(attribute);
	}
	}

}
