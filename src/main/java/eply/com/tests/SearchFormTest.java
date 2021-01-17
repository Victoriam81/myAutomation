package eply.com.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import eply.com.pageobjects.HelloShavitPage;
import eply.com.pageobjects.LoginPage;
import eply.com.pageobjects.SearchAllPage;

public class SearchFormTest extends BaseTest {


	//login flow
	@Test(priority = 1)
	public void loginFlow() {
		LoginPage login = new LoginPage(driver);
		login.loginFlow("shavit1986@gmail.com", "shavitdemo123");
		String expected = "Hello, Shavit";
		String actual = login.getText();
		Assert.assertEquals(actual, expected);
	}
	//click search and wait
	@Test(priority = 2)
	public void searchAndWait() {
		HelloShavitPage search = new HelloShavitPage(driver);
		search.clickSearch(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	//fill the form and wait
	@Test(priority=3)
	public void fillTheForm() {
		SearchAllPage form = new SearchAllPage(driver);
		form.fillTheForm("12.12.09", "12.12.20", "shavit1986@gmail.com");
	}
	//Check if there is spinner
	@Test(priority=4)
	public void checkTheSpinner() {
		SearchAllPage form = new SearchAllPage(driver);
		boolean spinnerPresent = form.SearchSucceed();
		if(spinnerPresent) {
			System.out.println("The search succeed");
		}
		else {
			System.out.println("search failed");
		}
	}



}
