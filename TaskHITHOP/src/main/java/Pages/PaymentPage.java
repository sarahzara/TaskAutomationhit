package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import Utilies.AssertionOfBrwoser;
import Utilies.actionOfBrowser;

public class PaymentPage extends actionOfBrowser {

	AssertionOfBrwoser assertion = new AssertionOfBrwoser();

	private By click1summary = By.id("order");
	private By clickOforder = By.id("order");
	private By checkboxorder = By.xpath("//input[@id='cgv']");
	private By clickOfship = By.id("order");
	private By clickbank = By.xpath("//a[@class='bankwire']");
	private By clickconfirm = By.xpath("//span[contains(text(),'I confirm my order')]");
	private By clickbacktoorder = By.xpath("//a[@class='button-exclusive btn btn-default']");

	private By checkorder = By.xpath("//table[@id='order-list']");

	public void clickSummary() {
		getElement(click1summary).sendKeys(Keys.ENTER);
	}

	public void clickOrder() {
		getElement(clickOforder).sendKeys(Keys.ENTER);
	}

	public void clickcheckbox() {
		getElement(checkboxorder).sendKeys(Keys.ENTER);
	}

	public void clickShip() {
		getElement(clickOfship).sendKeys(Keys.ENTER);
	}

	public void clickBank() {
		getElement(clickbank).sendKeys(Keys.ENTER);
	}

	public void clickConfirm() {
		getElement(clickconfirm).sendKeys(Keys.ENTER);
	}

	public void clickBackToOrder() {
		getElement(clickbacktoorder).sendKeys(Keys.ENTER);
	}

	public void assertorder() {

		assertion.assertElementNotExist(checkorder);
	}

}
