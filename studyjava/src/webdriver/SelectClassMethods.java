package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethods {

	public static void main(String[] args) throws InterruptedException {

		// WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year' and @title='Year']"));

		Select s = new Select(year);

		List<WebElement> yearlist = s.getOptions();

		System.out.println(yearlist.size());

		for (WebElement yr : yearlist) {

			System.out.println(yr.getText());
		}

		s.selectByIndex(11);
		Thread.sleep(3000);
		s.selectByValue("2000");
		Thread.sleep(3000);
		s.selectByVisibleText("1990");
		Thread.sleep(1000);
	}
}
