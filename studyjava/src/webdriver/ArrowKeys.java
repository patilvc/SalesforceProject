package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ArrowKeys {

	public static void main(String[] args) throws InterruptedException {


		

		System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		 WebElement Crateaccount = driver.findElement(By.xpath("//a[@role='button'][@rel='async']"));	
		 Actions act = new Actions(driver);
		 
		 act.moveToElement(Crateaccount).click().build().perform();
		 Thread.sleep(2000);
		WebElement Month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		
		act.moveToElement(Month).click().build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		
	}

}
