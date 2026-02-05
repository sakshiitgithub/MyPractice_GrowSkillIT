package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.BaseClass;

public class NewAccountPage extends BaseClass {
	
    WebDriver driver;
	
	public NewAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='New Account']")
	WebElement newAcctLink;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement custId;
	
	@FindBy(xpath="//select[@name='selaccount']")
	WebElement accountTypeDropdown;
	
	@FindBy(xpath="//input[@name='inideposit']")
	WebElement initialDeposit;
	
	@FindBy(xpath="//input[@value='submit']")
	WebElement submitBtn;
	
	public void clickNewAccount()
	{
		newAcctLink.click();
	}
	
	public void enterCustomerId(String customerId)
	{
		custId.sendKeys(customerId);
	}
	
	public void selectAccountType()
	{
		Select sel = new Select(accountTypeDropdown);
		sel.selectByIndex(0);
	}
	
	public void enterDeposit(String initDeposit)
	{
		initialDeposit.sendKeys(initDeposit);
	}
	
	public void clickSubmitBtn()
	{
		submitBtn.click();
	}
	
	public void fetchNewAccountTitle() throws Exception
	{
		String str1 = getTitle();
		   System.out.println(str1);
		   if(str1.contains("Gtpl Bank"))
		   {
			  System.out.println("Test case passed");
		   }
		   else 
		   {
			   throw new Exception("Invalid page loaded");
		   }
	}

}
