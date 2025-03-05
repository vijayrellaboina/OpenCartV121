package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass{

	
	@Test(groups= {"Regression","Master"})
	public void verify_account_registration() throws InterruptedException 
	{
		
		logger.info("****Starting TC001_AccountRegistrationTest **** ");
		try{
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("****Clicked on MyAccount Link **** ");
		hp.clickRegister();
		logger.info("****Clicked on Register Link **** ");
		AccountRegistrationPage reg = new AccountRegistrationPage(driver);
		logger.info("Providing customer details...");
		reg.setFirstName(randomeString().toUpperCase());
		reg.setLastName(randomeString().toUpperCase());
		reg.setEmail(randomeString()+"@gmail.com");//randomly generated the email
		String password =randomeAlphaNumeric();
		reg.setPassword(password);
		reg.setcofirmPassword(password);
		//reg.setTelephone(randomeNumber());
		
		Thread.sleep(3000);
		reg.clickbtnAgree();
		reg.clickbtnContinue();
		logger.info("Validating expected message ");
		String confmsg=reg.getConfirmationMSG();
		if(confmsg.equals("Your Account Has Been Created!")) {
		Assert.assertTrue(true);
		}
		else {
			logger.error("Test failed....");
			logger.debug("Debug logs..");
			Assert.assertFalse(false);
		}
		
		}
		catch (Exception e)
		{
			
			Assert.fail();
		}
		logger.info("**** Finished TC001_AccountRegistrationTest ****");
		
	}
}

