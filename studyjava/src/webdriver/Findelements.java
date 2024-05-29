package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).isDisplayed();
	  List <WebElement>	allLinks= driver.findElements(By.xpath("//a"));
	   int LinkCount=allLinks.size();
	   System.out.println("Total links ="+LinkCount);
	   for(WebElement LinkTitle:allLinks) {
		   
		   System.out.println(LinkTitle.getText());
	   }
		
	}

}
