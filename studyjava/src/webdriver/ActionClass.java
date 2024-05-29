package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//img[@alt='Chevron']")).click();
		
		Actions act= new Actions(driver);
		WebElement loginbutton = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		
		act.moveToElement(loginbutton).perform();
		
		Thread.sleep(1000);
		WebElement logo = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		
		act.contextClick(logo).perform();
		
		List<WebElement> Loginlist = driver.findElements(By.xpath("//ul[@class='_3YjYK7 ecs1XG']/a"));
		
		for (WebElement Loginitem:Loginlist) {
			
			System.out.println(Loginitem.getText());
		}
		
		
		
	}

}
