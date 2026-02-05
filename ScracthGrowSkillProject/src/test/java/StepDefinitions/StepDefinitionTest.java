package StepDefinitions;

import org.openqa.selenium.WebDriver;

import PageFactory.LoginPage;
import PageFactory.NewAccountPage;
import PageFactory.NewCustomerPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionTest extends BaseClass {
	
	WebDriver driver = BaseClass.initializeDriver();
	LoginPage obj = new LoginPage(driver);
	NewCustomerPage obj1=new NewCustomerPage(driver);
	NewAccountPage obj2 = new NewAccountPage(driver);
	
	@Given("user launches the Guru99 demo application")
	public void user_launches_the_guru99_demo_application() {
		getTitle();
	}

	@Given("user enters the {string} in the UserId textbox")
	public void user_enters_the_in_the_user_id_textbox(String user_id) {
	    obj.enterUsername(user_id);
	}

	@Given("user enters {string} in password textbox")
	public void user_enters_in_password_textbox(String password)  {
	   obj.enterPassword(password);
	}

	@When("user will click on the login button")
	public void user_will_click_on_the_login_button() {
	   obj.clickLogin();
	}

	@Then("user will be navigated to Guru99 demo application")
	public void user_will_be_navigated_to_guru99_demo_application() throws Exception {
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
	}
	
	@Then("user clicks on new customer link")
	public void user_clicks_on_new_customer_link() {
		obj1.clickNewCustomer();
	}

	@Then("user enters the {string} in  customer name field")
	public void user_enters_the_in_customer_name_field(String cust_name) {
	    obj1.enterCustname(cust_name);
	}

	@Then("user selects the gender")
	public void user_selects_the_gender() {
	    obj1.selectGender();
	}

	@Then("user enters the {string} in the date of birth field")
	public void user_enters_the_in_the_date_of_birth_field(String dob) {
	    obj1.addDOB(dob);
	}

	@Then("user enters the {string} in the address field")
	public void user_enters_the_in_the_address_field(String address) {
	    obj1.enterAddress(address);
	}

	@Then("user enters the {string} in the city field")
	public void user_enters_the_in_the_city_field(String city) {
	    obj1.enterCity(city);
	}

	@Then("user enters the {string} in the state field")
	public void user_enters_the_in_the_state_field(String state) {
	    obj1.enterState(state);
	}

	@Then("user enters the {string} in the pinCode field")
	public void user_enters_the_in_the_pin_code_field(String pin) {
	    obj1.enterPIN(pin);
	}

	@Then("user enters the {string} in the mobileNumber field")
	public void user_enters_the_in_the_mobile_number_field(String mob) {
	    obj1.enterPhoneNumber(mob);
	}

	@Then("user enters the {string} in the emailId field")
	public void user_enters_the_in_the_email_id_field(String email) {
	    obj1.enterEmailId(email);
	}

	@When("user will click on the SUBMIT button")
	public void user_will_click_on_the_submit_button() {
	   obj1.clickSubmitButton();
	}

	@Then("user will be navigated to New Customer Page and fetches the Customer Id")
	public void user_will_be_navigated_to_new_customer_page_and_fetches_the_customer_id() throws Exception {
	   obj1.fetchCustomerId();
	}
	
	@Then("user clicks on new account link")
	public void user_clicks_on_new_account_link() {
	    obj2.clickNewAccount();
	}
	
	@Then("user enters the {string} in  customer id field")
	public void user_enters_the_in_customer_id_field(String cust_id) {
	    obj2.enterCustomerId(cust_id);
	}

	@Then("user selects the account type from dropdown")
	public void user_selects_the_account_type_from_dropdown() {
	   obj2.selectAccountType();
	}

	@Then("user enters the {string} in the Initial deposit field")
	public void user_enters_the_in_the_initial_deposit_field(String deposit) {
	    obj2.enterDeposit(deposit);
	}
	
	@When("user will click on Submit button")
	public void user_will_click_on_submit_button() {
	    obj2.clickSubmitBtn();
	}
	

	@Then("user will be navigated to New Account Page")
	public void user_will_be_navigated_to_new_account_page() throws Exception {
	    obj2.fetchNewAccountTitle();
	}
	
	@Then("user closes the entire browser")
	public void user_closes_the_entire_browser() throws InterruptedException {
		Thread.sleep(4000);
		closeBrowser();
	}


}
