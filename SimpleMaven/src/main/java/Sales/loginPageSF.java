package Sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageSF extends utilityclass {

	@FindBy(xpath = "//input[@id='username']")private WebElement UN;

	@FindBy(xpath = "//input[@id='password']")private WebElement Password;

	@FindBy(xpath = "//input[@id='Login']")private WebElement Submit;

	// WebDriver driver;

	public loginPageSF(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void UserName() {

		// UN.sendKeys("kalpeshshirode88@brave-impala-80re4w.com");;

		UN.sendKeys(username);

	}

	public void pass() {

		// Password.sendKeys("Devansh@2020");
		Password.sendKeys(Passw);
	}

	public void submitButton() {

		Submit.click();
		;
	}

}
