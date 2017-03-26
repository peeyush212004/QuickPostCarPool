package pool.runner;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	private WebDriver driver;
	private boolean acceptNextAlert = true;
	
	@Given("^User enters \"([^\"]*)\" as input in Email Address in quick post.$")
	public void User_enters_as_input_in_Email_Address_in_quick_post(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver = new FirefoxDriver();
		driver.get("file:///C:/CSD_Req_Software/workspace/CarPool/src/main/Pool.html");
	    driver.findElement(By.name("FromEmailAddress")).sendKeys(arg1);
	}

	@Given("^User enters \"([^\"]*)\" as input in Mobile Number in quick post.$")
	public void User_enters_as_input_in_Mobile_Number_in_quick_post(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.name("PhoneNumber")).sendKeys(arg1);
	}

	@Given("^User enters \"([^\"]*)\" as input in Name in quick post.$")
	public void User_enters_as_input_in_Name_in_quick_post(String arg1) throws Throwable {
		driver.findElement(By.name("Name")).sendKeys(arg1);
	}

	@Given("^User enters \"([^\"]*)\" as input in Source in quick post.$")
	public void User_enters_as_input_in_Source_in_quick_post(String arg1) throws Throwable {
		driver.findElement(By.name("FromProjectName")).sendKeys(arg1);
	}

	@Given("^User enters \"([^\"]*)\" as input in Destination in quick post.$")
	public void User_enters_as_input_in_Destination_in_quick_post(String arg1) throws Throwable {
		driver.findElement(By.name("FromPMName")).sendKeys(arg1);
	}

	@Given("^User enters \"([^\"]*)\" as input in Additional Information in quick post.$")
	public void User_enters_as_input_in_Additional_Information_in_quick_post(String arg1) throws Throwable {
		driver.findElement(By.name("Comments")).sendKeys(arg1);
	}

	@When("^User click on submit$")
	public void User_click_on_submit() throws Throwable {
		driver.findElement(By.name("skip_Submit")).click();
	}

	@Then("^A error msg \"([^\"]*)\" pop up should be displayed.$")
	public void A_error_msg_pop_up_should_be_displayed(String arg1) throws Throwable {
		
		Assert.assertEquals(arg1, closeAlertAndGetItsText());
	}

	@Then("^home page should not be displayed.$")
	public void home_page_should_not_be_displayed() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^A  msg \"([^\"]*)\" should be displayed.$")
	public void A_msg_should_be_displayed(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^\"([^\"]*)\" page should be displayed.$")
	public void page_should_be_displayed(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	  private String closeAlertAndGetItsText() {
		    try {
		      Alert alert = driver.switchTo().alert();
		      String alertText = alert.getText();
		      if (acceptNextAlert) {
		        alert.accept();
		      } else {
		        alert.dismiss();
		      }
		      return alertText;
		    } finally {
		      acceptNextAlert = true;
		    }
		  }
	
}
