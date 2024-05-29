package webdriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckbox {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		List<WebElement> Checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i = 0; i <= Checkboxes.size() - 1; i++) {
			Thread.sleep(3000);
			Checkboxes.get(i).click();
			break;
		}
//		IsSelected	
		boolean result = driver.findElement(By.xpath("//input[@type='checkbox' and @value='checkbox2']")).isSelected();
		System.out.println(result);
		;
	}
}
