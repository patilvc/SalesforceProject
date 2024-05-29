package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Openbrowser {

	public static void main(String[] args) {

		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium files\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\Selenium files\\msedgedriver.exe");
		driver = new EdgeDriver();

	}

}
