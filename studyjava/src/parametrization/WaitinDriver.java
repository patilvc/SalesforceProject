package parametrization;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitinDriver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://theautomationzone.blogspot.com/2022/08/dynamic-elements-synchronization.html");
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[text()='Show Message with small delay']")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(20)) ;
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='This message is shown with small delay"))).click();
		
	//	driver.findElement(By.xpath("//p[text()='This message is shown with small delay']']")).click();
		
		

//  1000 TC   -20sec
	
//300TC * 20Sec= 100min
//300TC* 5 SEc	=25min	    save =75min

	}

}
