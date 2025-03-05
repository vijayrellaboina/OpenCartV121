package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-firstname']") 
	WebElement txtfirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']") WebElement 
	txtlastname;
	
	@FindBy(xpath="//input[@id='input-email']") 
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='input-confirm']") 
	WebElement txtconfpassword;
	
	@FindBy(xpath="//input[@id='input-telephone']") 
	WebElement txtTelephone;
	
	@FindBy(xpath="//input[@name='agree']") 
	WebElement btnagree;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirm;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	

	
	
	
	public void setFirstName(String fname) {
		txtfirstname.sendKeys(fname);
	}
	public void setLastName(String flast) {
		txtlastname.sendKeys(flast);
	}
	public void setEmail(String femail) {
		txtemail.sendKeys(femail);
	}
	
	public String setPassword(String fpassword) {
		txtpassword.sendKeys(fpassword);
		return fpassword;
	}
	
	public String setcofirmPassword(String fconfirmpassword) {
		txtconfpassword.sendKeys(fconfirmpassword);
		return fconfirmpassword;
	}
	
	public void setTelephone(String ftelephone) {
		txtTelephone.sendKeys(ftelephone);
	}
	
	public void clickbtnAgree() {
		btnagree.click();
	}
	
	public void clickbtnContinue() {
		btnContinue.click();
		
		//btnContinue.submit();
		
		//Actions act=new Actions(driver);
		//act.moveToElement(btnContinue).click().build().perform();
		
		//WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
		
		//btnContinue.sendKeys(Keys.RETURN);
		}
	public String getConfirmationMSG() {
		try {
			return (msgConfirm.getText());
		} catch (Exception e) {
			return(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	


}
