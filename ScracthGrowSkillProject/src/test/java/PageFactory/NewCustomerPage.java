package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class NewCustomerPage extends BaseClass {
	
    WebDriver driver;
	
	public NewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement newCustlink;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement custname;
	
	@FindBy(xpath="//input[@value='f']")
	WebElement gender;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement DOB;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement addr;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement State;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement PIN;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement phoneNumber;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//td[text()='Customer ID']/following-sibling::td")
	WebElement customerId;
	
	public void clickNewCustomer()
	{
		newCustlink.click();
	}
	
	
	public void enterCustname(String Customername)
	{
		custname.sendKeys(Customername);
	}
	
	public void selectGender()
	{
		gender.click();
	}
	
	public void addDOB(String dateOfBirth)
	{
		DOB.sendKeys(dateOfBirth);
	}
	
	public void enterAddress(String address)
	{
		addr.sendKeys(address);
	}
	
	public void enterCity(String cityName)
	{
		City.sendKeys(cityName);
	}
	
	public void enterState(String stateName)
	{
		State.sendKeys(stateName);
	}
	
	public void enterPIN(String pinCode)
	{
		PIN.sendKeys(pinCode);
	}
	
	public void enterPhoneNumber(String phoneNo)
	{
		phoneNumber.sendKeys(phoneNo);
	}
	
	public void enterEmailId(String emailID)
	{
		emailId.sendKeys(emailID);
	}
	
	public void clickSubmitButton()
	{
		submitButton.click();
	}
	
	public void fetchCustomerId() throws Exception
	{
		String str1 = getTitle();
		   System.out.println(str1);
		   if(str1.contains("Guru99"))
		   {
			  System.out.println("Test case passed");
		   }
		   else 
		   {
			   throw new Exception("Invalid page loaded");
		   }
		
		String text = customerId.getText();
		System.out.println("Customer Id: " + text);
	}
	

}
