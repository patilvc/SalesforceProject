package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args)  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act= new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//act.moveToElement(btn).doubleClick().build().perform();
        act.doubleClick(btn).perform();
	}

}
