package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Thread.sleep(2000);

		WebElement Multi = driver.findElement(By.xpath("//select[@id='second']"));
        
        Select s= new Select(Multi);
        
       boolean result = s.isMultiple();
       
       if (result =true) {
    	   
    	   System.out.println("multiple options selecteble");
       }
       else {
    	   
    	   System.out.println("Not Multiselecteble");
       }
       
//		 selections*******************
       Thread.sleep(2000);
       s.selectByIndex(0);
       Thread.sleep(2000);
       s.selectByValue("burger");
       Thread.sleep(2000);
       s.selectByVisibleText("Bonda");
       
       
        List<WebElement> Selectoptions = s.getAllSelectedOptions();
        
        
        for(WebElement D:Selectoptions) {
        	
        	System.out.println(D.getText());
        }
        
       
		// Deselections*******************

		Thread.sleep(2000);

		s.deselectByIndex(2);
		Thread.sleep(2000);
		s.deselectByValue("pizza");
		Thread.sleep(2000);
		s.deselectByVisibleText("Bonda");
		Thread.sleep(6000);

		WebElement Single = driver.findElement(By.xpath("//select[@id='first']"));

		Select s1 = new Select(Single);

		WebElement Product = s1.getFirstSelectedOption();

		String a = Product.getText();
		System.out.println(a);

       Thread.sleep(2000);
       s1.selectByIndex(0);
       Thread.sleep(2000);
       s1.selectByValue("Google");
       Thread.sleep(2000);
       s1.selectByVisibleText("Iphone");

       
		WebElement Heading = driver.findElement(By.xpath("//h1[@class='breadcrumb-item']"));

		String b = Heading.getText();

		System.out.println(b);
	}

}
