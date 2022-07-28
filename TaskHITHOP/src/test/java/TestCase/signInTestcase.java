package TestCase;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import Pages.LoginPage;

/**
 * @author Sarah
 * @return Nothing.
 * @exception IOException On input error.
 */
public class signInTestcase extends LoginPage {
//	@Listeners({ExtentITestListenerClassAdapter.class})
//	public class LoginTest extends LoginPage{
//		HomePage homePage = new HomePage();
//		MyAccountPage myAccountPage = new MyAccountPage();
//		Screenshots screenshots = new Screenshots();
//		//=======================================================
	LoginPage newUser = new LoginPage();

	@Test
	public void createNewAccount2() {

		try {
			newUser.openUrl2();
			// newUser.clickSignin();
			newUser.typeinputEmail("156e6a884c@catdogmail.live");
			// a4a945803a@catdogmail.live
			newUser.clickCreateUser();
			newUser.clickTitle();
			newUser.typeFirstname("sara");
			newUser.typeLastname("ooo");
			newUser.typeinputPassd("12345");
			newUser.clickcheckboxs();
			newUser.inpustOfAddress("125,cairo,cairo");
			newUser.inpustOfCity("cairo");
			newUser.inpustOfSate("2");
			newUser.inpustOfPostcode("12345");

			newUser.inpustOfCountry("2");
			newUser.inpustOfmobile("0123456789");
			newUser.clickRegister();
			// newUser.scrollDownToBottomOfPage();
			// WebDriverWait wait = new WebDriverWait(driver, 40);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
