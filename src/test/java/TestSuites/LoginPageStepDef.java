package TestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	@Given("Admin is on login page")
	public void admin_is_on_login_page() {
		Config.confChrome();
		Config.driver = new ChromeDriver();
		Config.maximaseWindow();
		String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(url);
	  
	}

	@When("Admin enter correct username (String) and correct password (String)")
	public void admin_enter_correct_username_admin_and_correct_password_admin123(String username,String password) {
		LoginPage page = new LoginPage();
		page.connect(username, password);
		
		
		
	    
	}

	@Then("Admin is directed to  the home page  that contains message {string}")
	public void admin_is_directed_to_the_home_page_that_contains_message(String expectedText) {
		LoginPage page = new LoginPage () ;
		String actualText = page.verifMessageLogin();
		Assert.assertEquals(expectedText, actualText,null );
		
		
		
				
		
	 
	}

}
