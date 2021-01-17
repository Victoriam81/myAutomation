package eply.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage{

	//declare the elements
	WebElement userNameField;
	WebElement passwordField;
	WebElement submitBnt;
	WebElement helloShavit;
	WebElement text;

	public LoginPage(WebDriver driver) {
		super(driver);

		//identify the elements
		userNameField = driver.findElement(By.cssSelector("#body_Username"));
		passwordField = driver.findElement(By.cssSelector("#body_Password"));
		submitBnt = driver.findElement(By.cssSelector("#body_SubmitButton"));
		helloShavit = driver.findElement(By.cssSelector("#ePlyHeader_FirstName"));
	}

	//Login
	public void loginFlow(String user, String password) {
		fillText(userNameField, user);
		fillText(passwordField, password);
		click(submitBnt);
	}
	public String getText () {
		text=helloShavit;
		return text.getText();

	}
}
