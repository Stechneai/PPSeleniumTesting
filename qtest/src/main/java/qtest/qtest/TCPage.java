package qtest.qtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TCPage extends BaseClass {

	public TCPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement email;

	public WebElement setUsername() {
		return email;
	}

	@FindBy(id = "password")
	private WebElement pwd;

	public WebElement setPassword() {
		return pwd;
	}

	@FindBy(xpath = "//button[text()='SIGN IN']")
	private WebElement btnSignIn;

	public WebElement btnSign() {
		return btnSignIn;
	}
}
