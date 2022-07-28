package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utilies.actionOfBrowser;

/**
 * @author Sarah
 *
 */
public class HomePage extends actionOfBrowser {

	private String webUrl = "http://automationpractice.com/";
	private By inputOfClick = By.xpath("//a[contains(text(),'Sign in')]");
	private WebDriver driver;

	public void openUrl() {
		driver.get(webUrl);
	}

	public void clickSignin() {
		getElement(inputOfClick).sendKeys(Keys.ENTER);
	}

}
