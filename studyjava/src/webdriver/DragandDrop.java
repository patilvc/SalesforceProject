package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);

		WebElement Src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement Src2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement BankSrc = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement SalesSrc = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));

// Target points 

		WebElement Dest1Amount = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement Dest2Amount = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		WebElement Dest3Bank = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement Dest4sales = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
	//	act.dragAndDrop(Src1,Dest1Amount ).perform();
		act.clickAndHold(Src1).release(Dest1Amount).build().perform();
		Thread.sleep(2000);
		act.clickAndHold(BankSrc).release(Dest3Bank).build().perform();
		Thread.sleep(2000);
		act.clickAndHold(Src2).release(Dest2Amount).build().perform();
		Thread.sleep(2000);
		act.clickAndHold(SalesSrc).release(Dest4sales).build().perform();
		Thread.sleep(2000);
	
	}

}
