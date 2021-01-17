package eply.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EventDetailsPage extends BasePage {
	//define the elements
	WebElement eventDetails;
	WebElement eventName;
	WebElement pageTitle;
	WebElement eventData;
	WebElement saveBtn;

	public EventDetailsPage(WebDriver driver) {
		super(driver);
		//find the elements
		eventDetails=driver.findElement(By.cssSelector("#Event_Info"));
		eventName=driver.findElement(By.cssSelector("#EventNameEdit"));
		pageTitle=driver.findElement(By.cssSelector("#PageTitle"));
		eventData=driver.findElement(By.cssSelector("#EventDateTextBox"));
		saveBtn=driver.findElement(By.cssSelector("#SaveEventInfoButton2"));
	}
	public String getText() {
		return eventDetails.getText();
	}
	public void fillEvent (String evName, String title, String data) {
		fillText(eventName, evName);
		fillText(pageTitle, title);
		fillText(eventData, data);
		click(saveBtn);
	}
}
