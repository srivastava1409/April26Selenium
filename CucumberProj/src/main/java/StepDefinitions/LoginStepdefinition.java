package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefinition {
	WebDriver driver;
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\CV\\Downloads\\Selenium drivers\\chromedriver.exe");	
	    driver=new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/mercurysignon.php");
	    
	}

	@When("^Title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
	    String title=driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("Sign-on: Mercury Tours",title);
	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	   driver.findElement(By.name("userName")).sendKeys("mercury");
	   driver.findElement(By.name("password")).sendKeys("mercury");
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.name("login")).click();
	}

	@Then("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    System.out.println("login");
	   driver.quit();
	}
	
	
	

}
