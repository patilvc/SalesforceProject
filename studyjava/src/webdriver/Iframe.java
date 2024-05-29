package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);

		// Iframe will handle with - ID ,Name ,webelement,index

		//driver.switchTo().frame("iframeResult");
		WebElement FrameElement=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(FrameElement);
	//	driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(a);
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@id='runbtn']")).click();	
		

	}

}
