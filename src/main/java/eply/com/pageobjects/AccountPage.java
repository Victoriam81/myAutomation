package eply.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountPage extends BasePage{

	//define the elements
	WebElement streetAdressField;
	WebElement websiteField;
	WebElement savebtn;

	public AccountPage(WebDriver driver) {
		super(driver);
		//identify the elements
		streetAdressField = driver.findElement(By.cssSelector("#Address"));
		websiteField = driver.findElement(By.cssSelector("#Website"));
		//Select provinces = new Select (driver.findElement(By.cssSelector("#Province")));
		//Select countries = new Select (driver.findElement(By.cssSelector("#Country")));
		savebtn = driver.findElement(By.cssSelector("#Button1"));
	}
	//fill the general information
	public void fillGenInf(String website, String adress) {
		fillText(websiteField, website);
		fillText(streetAdressField, adress);
		Select provinces = new Select (driver.findElement(By.cssSelector("#Province")));
		provinces.selectByVisibleText("Alabama");
		Select countries = new Select (driver.findElement(By.cssSelector("#Country")));
		countries.selectByVisibleText("Uganda");
		click(savebtn);
	}



}
