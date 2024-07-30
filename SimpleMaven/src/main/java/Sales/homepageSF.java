package Sales;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

public class homepageSF extends utilityclass {
		
		@FindBy(xpath = "(//span[text()='Accounts'])[1]")private WebElement AccountTab;
		
		
		@FindBy(xpath = "//button[@title='Select a List View: Accounts']")private WebElement Account_List_view;
		
		@FindBy(xpath = "//span[text()='All Accounts']")private WebElement AllAccounts_Tab;
		
		@FindBy(xpath = "//a[@title='Acme (Sample)']")private WebElement AccountSelect;
		
		
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;

		public homepageSF(WebDriver driver) {

			PageFactory.initElements(driver, this);
		}

		public void AccountTab() {

			
			js.executeScript("arguments[0].click()",AccountTab);
			
			
			//AccountTab.click();
		}

		public void AccountList() {

			
			Account_List_view.click();
		}

		public void allaccounts() {

			AllAccounts_Tab.click();
		}
		
		public void Accountselect() {

			AccountSelect.click();
		}
		

	}

	


