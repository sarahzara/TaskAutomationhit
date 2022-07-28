package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import Utilies.actionOfBrowser;

/**
 * @author Sarah
 * @param inputvalue
 * @return Nothing
 * 
 */
public class AuthenticationPage extends actionOfBrowser {

	private By typeEmail = By.id("email");
	private By typePassd = By.id("passwd");
	private By clickSignin = By.xpath("//button[@id='SubmitLogin']");

	public void typeEmailsignin(String inputvalue) {
		getElement(typeEmail).sendKeys(inputvalue);

	}

	public void typePassdsignin(String inputvalue) {
		getElement(typePassd).sendKeys(inputvalue);
	}

	public void getClickSignin() {
		getElement(clickSignin).sendKeys(Keys.ENTER);
	}

}
