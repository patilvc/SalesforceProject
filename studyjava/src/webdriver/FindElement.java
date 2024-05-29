package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {


		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text' and @id='email']")).sendKeys("Vcpatil@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password' and @id='pass']")).sendKeys("123545");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login'and @type='submit']")).click();
		
	}

}
