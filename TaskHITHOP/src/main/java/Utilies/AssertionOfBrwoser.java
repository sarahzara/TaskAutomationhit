package Utilies;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AssertionOfBrwoser extends actionOfBrowser {

	public void assertElementText(By locator, String text) {
		String elementText = "";
//        try {
		elementText = getElement(locator).getText();
		assertEquals(elementText, text);
//            System.out.println("Assertions passed - Actual Text: [" + elementText + "] does match expected text successfully.");
//        } catch (AssertionError ae) {
//            ae.printStackTrace();
//            System.out.println("Assertions failed - Actual Text: [" + elementText + "] does not match expected text.");
//            Assert.fail();
//        }
	}

	public void assertElementNotExist(By locator) {
		try {
			assert getElement(locator).isDisplayed();
			System.out.println("Assertions failed - Element by locator: [" + locator + "] exist");
			Assert.fail();
		} catch (Exception e) {
			System.out.println("Assertions passed - Element by locator: [" + locator + "] not exist.");
		}
	}
}
