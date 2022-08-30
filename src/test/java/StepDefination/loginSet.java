package StepDefination;


import org.junit.Assert;

import com.base.TestBase;
import com.page.LoginPage;
import com.page.SignIn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginSet extends TestBase {
	
	
		LoginPage loginpage;
		SignIn signin;
	
	@Given("User is already in Login Page")
	public void user_is_already_in_login_page() {
	initialization();
	
	    
	}
	@When("title of saucedemo page is Swag Labs")
	public void title_of_saucedemo_page_is_swag_labs() {
		loginpage = new LoginPage();
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Swag Labs");
		
	   
	}
	@Then("user enters username and password")
	public void user_enters_username_and_password() {
	signin = loginpage.clickOnsignIn(prop.getProperty("username"),prop.getProperty("password"));
	    
	}
	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	    
	}
	@Then("user is on home page")
	public void user_is_on_home_page() {
	   
	}


}
