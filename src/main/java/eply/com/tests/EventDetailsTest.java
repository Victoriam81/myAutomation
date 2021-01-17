package eply.com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import eply.com.pageobjects.EventDetailsPage;
import eply.com.pageobjects.HelloShavitPage;
import eply.com.pageobjects.LoginPage;

public class EventDetailsTest {
	public static void main(String[] args) throws InterruptedException {

		//define path the driver 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.eply.com/Login/index.aspx");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//login flow
		LoginPage login = new LoginPage(driver);
		login.loginFlow("shavit1986@gmail.com", "shavitdemo123");

		//click form settings and wait
		HelloShavitPage search = new HelloShavitPage(driver);
		search.clickSettings(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//check if we at the "Event Details" tab
		EventDetailsPage event = new EventDetailsPage(driver);
		String eventDtl = event.getText();
		if(eventDtl.toLowerCase().contains("event details")) {
			System.out.println("U are at the right tab " + eventDtl);
		}
		else {
			System.out.println("try again");
		}

		event.fillEvent("newVictoriaTest", "TestVictoriaPOM", "31/12/20");
		driver.quit();
	}
}
