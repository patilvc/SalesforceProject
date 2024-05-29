package webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		Thread.sleep(3000);	
		Alert alert = driver.switchTo().alert();
		String a = alert.getText();
		System.out.println(a);
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();	
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
		String b = alert1.getText();
		System.out.println(b);
		Thread.sleep(3000);
		alert.dismiss();
		Thread.sleep(3000);
	}

}
