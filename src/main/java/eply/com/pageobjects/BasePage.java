package eply.com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {

	WebDriver driver; 

	public BasePage (WebDriver driver) {
		this.driver=driver;
	}

	public void click (WebElement web) {
		web.click();
	}

	public void fillText(WebElement web, String text) {
		web.clear();
		web.sendKeys(text);
	}


}



