package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class datadriven {
	WebDriver driver;
	
	@Given("^User is already on flights page$")
	public void user_is_already_on_flights_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CV\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	    driver=new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/mercurysignon.php");
	}

	@When("^Title of flights page is Free CRM$")
	public void title_of_flights_page_is_Free_CRM() throws Throwable {
		String title=driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("Sign-on: Mercury Tours",title);
	}

	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(username);
		   driver.findElement(By.name("password")).sendKeys(password); 
	}

	@Then("^User clicks login button$")
	public void user_clicks_login_button() throws Throwable {
		driver.findElement(By.name("login")).click();
	}
	
	@When("^User clicks on profile details$")
	public void user_clicks_on_profile_details() throws Throwable {
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a")).click();
	}

	@Then("^User enters details on profile page \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_details_on_profile_page_and(String firstname, String lastname) throws Throwable {
	    Thread.sleep(3000);
	    driver.findElement(By.name("firstName")).sendKeys(firstname);
	    driver.findElement(By.name("lastName")).sendKeys(lastname);
	    
	}

	

@When("^User will enter username and password$")
public void user_will_enter_username_and_password(DataTable credentials) throws Throwable {
	List<List<String>> data=credentials.raw();
	driver.findElement(By.name("userName")).sendKeys(data.get(0).get(0));
	   driver.findElement(By.name("password")).sendKeys(data.get(0).get(1)); 
}
}
