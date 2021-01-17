package eply.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchAllPage extends BasePage {

	//declare the elements
	WebElement fromData;
	WebElement toData;
	WebElement email;
	WebElement searchForm;
	WebElement spinner;

	public SearchAllPage(WebDriver driver) {
		super(driver);
		//identify the elements
		fromData = driver.findElement(By.cssSelector("#RadFromDatePicker_dateInput"));
		toData = driver.findElement(By.cssSelector("#RadToDatePicker_dateInput"));
		email = driver.findElement(By.cssSelector("#Email"));
		searchForm = driver.findElement(By.cssSelector("#SearchButton"));
		spinner = driver.findElement(By.cssSelector("#ralpLoading"));
	}

	//fill the data
	public void fillTheForm (String FromData, String ToData, String Email) {
		fillText(fromData, FromData);
		fillText(toData, ToData);
		fillText(email, Email);
		click(searchForm);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#SearchGridRegistrations_ctl00")));
		click(searchForm);

	}
	public boolean SearchSucceed() {
		boolean spinnerPresent = spinner.isDisplayed();
		System.out.println("spinner is displayed " + spinnerPresent);
		return spinnerPresent;
	}

}
