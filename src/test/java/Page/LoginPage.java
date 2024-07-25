package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginPage {
	@FindBy(name="username")
	WebElement username ;
	@FindBy(name="password")
	WebElement password ;
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement btnlogin ;
@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")	
WebElement LoginDashboardMessage ;
public LoginPage () {
	PageFactory.initElements(Config.driver, this);
}
public void connect ( String Username , String PWD) {
	username.sendKeys(Username);
	password.sendKeys(PWD);
	btnlogin.click();
	
}
public String verifMessageLogin () {
	String actualText = LoginDashboardMessage.getText();
	return actualText ;
	
	
}

}
