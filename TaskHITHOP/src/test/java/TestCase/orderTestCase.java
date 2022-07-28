package TestCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AuthenticationPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.OrderPage;
import Pages.PaymentPage;

/**
 * @author Sarah
 * @return Nothing.
 * @exception IOException On input error.
 */
public class orderTestCase extends OrderPage {

	LoginPage loginpage = new LoginPage();
	AuthenticationPage authopage = new AuthenticationPage();
	PaymentPage paymentpage = new PaymentPage();
	HomePage homepage = new HomePage();

	@Test
	public void ordertest() {
		try {

//			homepage.openUrl();
//			homepage.clickSignin();
			loginpage.openUrl2();
			authopage.typeEmailsignin("0e16da1ccf@catdogmail.live");
			authopage.typePassdsignin("12345");
			authopage.getClickSignin();
			getClickWoman();
			getblouse();
			// getClickBlouse();
			// assertblouses();
			inpustOfSize("2");
			clickcolor();
			clickAddToCart();
			clickProceedtocheckout();

			paymentpage.clickSummary();
			paymentpage.clickOrder();
			paymentpage.clickcheckbox();
			paymentpage.clickShip();
			paymentpage.clickBank();
			paymentpage.clickConfirm();
			paymentpage.clickBackToOrder();
			paymentpage.assertorder();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
