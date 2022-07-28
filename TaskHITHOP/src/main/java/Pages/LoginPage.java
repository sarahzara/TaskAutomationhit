package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.TestBase;
import Utilies.actionOfBrowser;

/**
 * @author Sarah
 * @param inputvalue
 * @param visibleText
 * @return Nothing.
 */
public class LoginPage extends actionOfBrowser {

	// private By inputOfClick = By.xpath("//a[contains(text(),'Sign in')]");
	private By clicknewUser = By.xpath("//span[normalize-space()='Create an account']");
	private By clcikByTitle = By.xpath("//input[@id='id_gender1']");
	private By inputOfFirstname = By.xpath("//input[@id='customer_firstname']");
	private By inputOfLastname = By.xpath("//input[@id='customer_lastname']");
	private By clickfirstcheckbox = By.xpath("//input[@id='newsletter']");
	private By clicksecondcheckbox = By.xpath("//input[@id='optin']");
	private By inpustOfAddress = By.id("address1");
	private By inpustOfcity = By.id("city");
	private By inpustOfSate = By.xpath("//select[@id='id_state']");

	private By inputOfpostcode = By.id("postcode");
	private By inputOfCountry = By.xpath("//select[@id='id_country']");
	private By inputOfphonemobile = By.id("phone_mobile");
	private By clickofRegister = By.xpath("//span[normalize-space()='Register']");

	private By inputtypeemail = By.id("email_create");
	private By inputtypePaasd = By.id("passwd");

	// private String webUrl = "http://automationpractice.com/";
	private String WEBAuthortication = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

/////////////////////////////////////////////////////////////////////////////////

//	public void openUrl() {
//		driver.get(webUrl);
//	}

	public void openUrl2() {
		driver.get(WEBAuthortication);
	}

//	public void clickSignin() {
//		getElement(inputOfClick).sendKeys(Keys.ENTER);
//	}

	public void typeinputEmail(String inputvalue) {
		getElement(inputtypeemail).sendKeys(inputvalue);
	}

	public void clickCreateUser() {
		getElement(clicknewUser).sendKeys(Keys.ENTER);
	}

	public void clickTitle() {
		getElement(clcikByTitle).sendKeys(Keys.ENTER);
	}

	public void typeFirstname(String inputValue) {
		getElement(inputOfLastname).sendKeys(inputValue);
	}

	public void typeLastname(String inputValue) {
		getElement(inputOfFirstname).sendKeys(inputValue);
	}

	public void typeinputPassd(String inputvalue) {
		getElement(inputtypePaasd).sendKeys(inputvalue);
	}

	public void clickcheckboxs() {
		getElement(clickfirstcheckbox).sendKeys(Keys.ENTER);
		getElement(clicksecondcheckbox).sendKeys(Keys.ENTER);
	}

	public void inpustOfCity(String inputvalue) {
		getElement(inpustOfcity).sendKeys(inputvalue);
	}

	public void inpustOfSate(String Visibletext) {
		selectFromDDLvalue(inpustOfSate, Visibletext);

	}

	public void inpustOfPostcode(String inputvalue) {
		getElement(inputOfpostcode).sendKeys(inputvalue);
	}

	public void inpustOfAddress(String inputvalue) {
		getElement(inpustOfAddress).sendKeys(inputvalue);
	}

	public void inpustOfCountry(String Visibletext) {
		selectFromDDLvalue(inputOfCountry, Visibletext);

	}

	public void inpustOfmobile(String inputvalue) {
		getElement(inputOfphonemobile).sendKeys(inputvalue);
	}

	public void clickRegister() {
		getElement(clickofRegister).sendKeys(Keys.ENTER);
	}

}