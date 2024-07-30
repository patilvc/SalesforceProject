package TestClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Sales.AccountPageSF;
import Sales.baseclassSF;
import Sales.homepageSF;
import Sales.loginPageSF;
import Sales.utilityclass;


public class logintest extends utilityclass {
	
	loginPageSF LS;
	homepageSF HF;
	
	@BeforeClass
	public void browserlaunch() throws InterruptedException {

		OpenBrowser();
		//Logger.info("URL is Opened");
		extent.flush();
	}
	
	@BeforeMethod
	public void login_process() throws InterruptedException {
		
	
		ExtentTest test= extent.createTest("Login Process verification");
		
		test.pass("User sucessfully logged in");
	//	test.warning("use proper credentials");
		
		LS = new loginPageSF(driver);
		LS.UserName();
	//	Logger.info("username entered");
		Thread.sleep(2000);
		LS.pass();
		
	//	Logger.info("password entered");
		Thread.sleep(2000);
		LS.submitButton();
	//	Logger.info("submit button click");
		Thread.sleep(2000);
		extent.flush();
		
		
		
	}
	
	

	
	@Test
	public void HomePage() throws InterruptedException {
		
        ExtentTest test= extent.createTest("Home page task completed ");
		
		test.pass("User is on homepage");
		
		HF = new homepageSF(driver);	
		HF.AccountTab();
		
	//	Logger.info("Clicked on account tab");

		Thread.sleep(2000);
		HF.AccountList();
		
	//	Logger.info("Clicked on Account list");
		Thread.sleep(2000);
		HF.allaccounts();
	//	Logger.info("Select all accounts");
		Thread.sleep(2000);
		HF.Accountselect();
	//	Logger.info("Select specific account");
		
		extent.flush();

	}
	
	@AfterMethod
    public void AccountPage() throws InterruptedException {
		
        ExtentTest test= extent.createTest("Home page task completed ");
		
		test.pass("User is on AccountPage");
		
		AccountPageSF  AC= new AccountPageSF(driver);
		
		AC.OppoTab();
		Thread.sleep(2000);
		AC.NewOpportunity();
		Thread.sleep(2000);
		AC.AccountName();
		Thread.sleep(2000);
		AC.AcmeAccount();
		extent.flush();

	}
	
	
	
}



