package Sales;





import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import net.bytebuddy.utility.RandomString;

public class baseclassSF  {
	
	
	static Readpropertyfile RP= new Readpropertyfile();

	public String username =RP.getusername();
	public String Passw =RP.PW();
	public static String BaseURL =RP.URL();
	
	public static ExtentReports extent = new ExtentReports();
	static ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");

	protected static WebDriver driver;
	
	public static Logger Logger;
	
	public static void OpenBrowser() throws InterruptedException {
	
		extent.attachReporter(spark);


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\git\\SalesforceProject\\SFProject\\drivers\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		try {
			driver.get(BaseURL);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
//        Logger=Logger.getLogger("SfProject");
//      PropertyConfigurator.configure("Log4j.properties");
      
      
		Thread.sleep(2000);
	}
  
   public static void capturescreenshot(String name) throws IOException {
	   
	   File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Source);
		String RandomName = RandomString.make(5);
		File dest = new File("C:\\Users\\admin\\git\\repository2\\SFProject\\ScreenShot\\Pune"+name+".jpg");
		FileHandler.copy(Source, dest);
	   
	   
   }
	
}
