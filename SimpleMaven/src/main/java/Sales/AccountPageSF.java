package Sales;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPageSF extends  utilityclass {
	
	
	@FindBy(xpath = "(//span[text()='Accounts'])[1]")private WebElement AccountTab;
	
	@FindBy(xpath="(//span[text()='Opportunities'])[1]")private WebElement Opportunitytab;
	@FindBy(xpath="//div[text()='New']")private WebElement NewOpportunityTab;
	@FindBy(xpath="//input[@role='combobox'][@placeholder='Search Accounts...']")private WebElement AccountName;
	@FindBy(xpath="//lightning-base-combobox-formatted-text[@title='Acme (Sample)']")private WebElement AcmeAccount;
	
	JavascriptExecutor js= (JavascriptExecutor)driver;

	public AccountPageSF(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void AccountTab() {

		
		js.executeScript("arguments[0].click()",AccountTab);
	}
	
     public void OppoTab() {

		
		js.executeScript("arguments[0].click()",Opportunitytab);
	}
     public void NewOpportunity() {

 		
 		js.executeScript("arguments[0].click()",NewOpportunityTab);
 	}
	
     public void AccountName() {

  		
    	 AccountName.sendKeys("Acme (Sample)");
  	}
     public void AcmeAccount() {

   		
    	 AcmeAccount.click();
  	}

}

