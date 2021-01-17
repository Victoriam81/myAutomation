package eply.com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import eply.com.pageobjects.HelloShavitPage;
import eply.com.pageobjects.LoginPage;
import eply.com.pageobjects.VewMyFormsPage;

public class ViewMyFormsTest {

	public static void main(String[] args) throws InterruptedException {

		//define path the driver 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\victoriam\\Desktop\\Automation\\drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.eply.com/Login/index.aspx");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//login flow
		LoginPage login = new LoginPage(driver);
		login.loginFlow("shavit1986@gmail.com", "shavitdemo123");

		//click view my forms and wait
		HelloShavitPage search = new HelloShavitPage(driver);
		search.clickMyForm(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//choose show all forms and print it
		VewMyFormsPage form = new  VewMyFormsPage(driver);
		form.printTheList();
		//driver.quit();
	}
}
