package Utilies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBase;

public class actionOfBrowser extends TestBase {

	Select select;

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			// scrollPageToElement(element);
		} catch (Exception ignored) {
		}
		return element;
	}

	// get element by index
	public WebElement getElementByIndex(By locator, int index) {
		WebElement element = driver.findElements(locator).get(index);
		scrollPageToElement(element);
		return element;
	}

	private void scrollPageToElement(WebElement element) {
		// TODO Auto-generated method stub

	}

	public int getIndexOfListByText(By locator, String selectionText) {
		int index = 0;
		List<WebElement> elementList = driver.findElements(locator);
		for (WebElement element : elementList) {
			System.out.println(element.getText());
			if (selectionText.contains(element.getText())) {
				if (element.getText().equals("-"))
					continue; // check for "-" is specialized because of access ID
				index = elementList.indexOf(element);
				break;
			}
		}
		return index;
	}

	public void selectFromDDL(By locator, int selectValue) {
		select = new Select(getElement(locator));
		select.selectByIndex(selectValue);
		//select.selectByVisibleText(selectValue);
	}
	
	public void selectFromDDL(By locator, String selectValue) {
		select = new Select(getElement(locator));
		//select.selectByIndex(selectValue);
		select.selectByVisibleText(selectValue);
	}
	
	public void selectFromDDLvalue(By locator, String selectValue) {
		select = new Select(getElement(locator));
		//select.selectByIndex(selectValue);
		select.selectByValue(selectValue);
	}

	// public void scrollDownToView(WebElement result) {
	// ((JavascriptExecutor) driver).
	// executeScript("arguments[0].scrollIntoView({behavior:'smooth',block:
	// 'center'});",
	// result);
	// }

	// public void scrollDownToView(WebElement result) {
	// // TODO Auto-generated method stub
	//
	// }

	public void scrollDownToBottomOfPage() {
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}
