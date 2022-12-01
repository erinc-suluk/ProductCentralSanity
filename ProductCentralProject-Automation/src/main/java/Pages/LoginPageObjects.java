package Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.pwc.productcentral.HelperFunctions;

import com.pwc.productcentral.Driver;



public class LoginPageObjects extends HelperFunctions{
	public LoginPageObjects() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(name= "j_username")
	private WebElement username;
	@FindBy(name="j_password")
	private WebElement password;
	@FindBy(id="submit-button")
	private WebElement signInButton;
	
	public void setUsername(String userName) {
		username.sendKeys(userName);
	}
	public void setPassword(String passWord) {
		password.sendKeys(passWord);
	}
	public void setSignInButton() {
		signInButton.click();
	}
	

}
