package webdriver;

import java.util.ArrayList;
import java.util.Set;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
		String ID1 = driver.getWindowHandle();
		System.out.println(ID1);
		driver.findElement(By.xpath("//button[@id='win1']")).click();
		String ID2 = driver.getWindowHandle();
		System.out.println(ID2);
		Set<String> IDs = driver.getWindowHandles(); // collection Set
		ArrayList al = new ArrayList(IDs);
		Thread.sleep(1000);		
		for(Object a:al) {		
			System.out.println(a);
		}
		// Child window Task
		driver.switchTo().window((String) al.get(2));
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Samsung");
		Thread.sleep(1000);
		//Move to Parent window
		driver.switchTo().window((String) al.get(1));		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi kalpesh");
	}
}
