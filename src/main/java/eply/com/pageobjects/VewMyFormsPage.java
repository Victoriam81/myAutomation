package eply.com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VewMyFormsPage extends BasePage {
	//define the elements
	List <WebElement> shownLines;

	public VewMyFormsPage(WebDriver driver) {
		super(driver);
		//find the elements
		shownLines = driver.findElements(By.cssSelector("td:nth-child(4) > span"));

	}
	//print the list size
	public void printTheList () {
		Select dataFilterDr = new Select(driver.findElement(By.cssSelector("#DateFilter")));
		dataFilterDr.selectByIndex(6);
		System.out.println("The list size is: " + shownLines.size());
	}
}


