package eply.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelloShavitPage extends BasePage {

	//declare the elements
	WebElement searchAll;
	WebElement account;
	WebElement viewMyForms;
	WebElement settingsForm;

	public HelloShavitPage(WebDriver driver) {
		super(driver);
		//identify the elements
		searchAll = driver.findElement(By.cssSelector("#ePlyHeader_SearchLink"));
		account = driver.findElement(By.cssSelector("#ePlyHeader_accountLink"));
		viewMyForms = driver.findElement(By.cssSelector("#ePlyHeader_dashboardLink"));
		settingsForm = driver.findElement(By.cssSelector("#FormList_ctl00__0 > td:nth-child(3) > span.fa.fa-cogs"));
	}
	//click search 
	public void clickSearch () {
		click(searchAll);
	}
	//click account
	public void clickAccount () {
		click(account);
	}
	//click account
	public void clickMyForm () {
		click(viewMyForms);
	}
	//click settings form
	public void clickSettings () {
		click(settingsForm);
	}
}



