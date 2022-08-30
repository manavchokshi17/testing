package com.page;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;


public class LoginPage extends TestBase  {

	//Page Factory - Object Repositary:
	
		

		@FindBy(id="user-name")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(name="login-button")
		WebElement LoginButton;
		
		
	//	
//		@FindBy(xpath = "//a[contains(@title,'register')][1]")
//		WebElement SignUpBtn;
	//	
//		@FindBy(xpath = "//div[@class='rd-navbar-brand']")
//		WebElement crmlogo;

		
		
		
		//Initialization the Page Objects:
		public LoginPage() {
			PageFactory.initElements(driver,this);
		}
		//Actions:
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
	
//		public boolean validateCRMImage() {
//			return crmlogo.isDisplayed();
//		}
		
		public SignIn clickOnsignIn(String un,String pw) {
			username.sendKeys(un);
			password.sendKeys(pw);
			LoginButton.click();
			return new SignIn();
			
		
		}
		
		

		
		
		
		
	

}
