package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		// IsDisplayed
		boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		if (result = true) {
			System.out.println("Logo Is displayed");
		} else {
			System.out.println("Logo Is Missing");
		}
		// IsEnabled
		boolean result1 = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		if (result1 = true) {
			System.out.println("Button is Enabled ");
		} else {
			System.out.println("Button is Not clickeble");
		}

	}

}
