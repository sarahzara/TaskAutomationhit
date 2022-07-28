package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilies.AssertionOfBrwoser;
import Utilies.actionOfBrowser;

/**
 * @author Sarah
 * @param inputvalue
 * @param stateValue
 */

public class OrderPage extends actionOfBrowser {

	AssertionOfBrwoser assertion = new AssertionOfBrwoser();

	private By ClickWoman = By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]");

	private By clickblouses = By.xpath("//a[@title='Blouse'][normalize-space()='Blouse']");

	private By ClickBlouse = By.id("my-account");

	String blouserText = "blouses";

	private By checkcatblouse = By.id("category");

	private By typeSize1 = By.xpath("//select[@id='group_1']");
	private By typeSize2 = By.xpath("//option[@value='2']");

	private By typecolor = By.xpath("//a[@id='color_8']");
	//// a[@id='color_8']

	private By clickaddtocart = By.xpath("//span[contains(text(),'Add to cart')]");

	private By clickcheckout = By.xpath("//span[contains(text(),'Proceed to checkout')]");

	public void getClickWoman() {
		getElement(ClickWoman).isSelected();
		getElement(ClickWoman).click();

	}

	public void getblouse() {
		getElement(clickblouses).sendKeys(Keys.ENTER);
	}

	public void assertblouses() {
		assertion.assertElementText(checkcatblouse, blouserText);
		// getElement(checkcatblouse).sendKeys(Keys.ENTER);
	}

	public void inpustOfSize(String stateValue) {

		selectFromDDLvalue(typeSize1, stateValue);

		getElement(typeSize2).sendKeys(Keys.ENTER);

	}

	public void clickcolor() {
		getElement(typecolor).click();
	}

	public void clickAddToCart() {
		getElement(clickaddtocart).sendKeys(Keys.ENTER);
	}

	public void clickProceedtocheckout() {
		getElement(clickcheckout).sendKeys(Keys.ENTER);
	}

}
