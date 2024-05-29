package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggetions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf' and @name='q']")).sendKeys("Samsung");

		Thread.sleep(5000);

		List<WebElement> Suggetions = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));// Collection

		for (WebElement Temp : Suggetions) {

			System.out.println(Temp.getText());
		}

		System.out.println("Total Suggetions =" + Suggetions.size());

		String a = "samsung s23";

		for (WebElement Temp : Suggetions) {

			Thread.sleep(2000);

			String B = Temp.getText();

			if (a.equals(B)) { // String methods

				Temp.click();
				break;

			}
		}

	}

}
