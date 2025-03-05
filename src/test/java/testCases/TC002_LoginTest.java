package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountyPage;

public class TC002_LoginTest extends BaseClass{

	@Test(groups= {"Sanity", "Master"})
	public void verify_login() {
		
		logger.info("****Starting TC001_AccountRegistrationTest **** ");
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmailAdress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountyPage macc= new MyAccountyPage(driver);
		boolean targetPage=macc.isMyAccountPageExists();
		
		//Assert.assertEquals(targetPage, true, "Login failed");
		Assert.assertTrue(targetPage);
		
		logger.info("****Finished TC_002LoginTest***");
		
		
		
		
		
		
	}
}
