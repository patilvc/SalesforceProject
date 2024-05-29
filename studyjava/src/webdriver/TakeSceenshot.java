package webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class TakeSceenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	for (int i=0;i<=2;i++)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

//		TakesScreenshot ts= (TakesScreenshot)driver;
//		 File Source = ts.getScreenshotAs(OutputType.FILE);
//		 System.out.println(Source);
		File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Source);
		String RandomName = RandomString.make(4);
		File dest = new File("C:\\Users\\admin\\git\\repository2\\studyjava\\Screenshot\\Pune"+RandomName+".jpg");
		FileHandler.copy(Source, dest);
		
		driver.close();
	}
	}

}
