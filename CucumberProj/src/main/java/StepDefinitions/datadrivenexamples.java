package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class datadrivenexamples {
	WebDriver driver;
	@Given("^User is already on mercury page$")
	public void user_is_already_on_mercury_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CV\\Downloads\\Selenium drivers\\chromedriver.exe");	
	    driver=new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/mercurysignon.php");
	}

	@When("^Title of mercury page$")
	public void title_of_mercury_page() throws Throwable {
		String title=driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("Sign-on: Mercury Tours",title);
	}

	@Then("^User gives \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(username);
		   driver.findElement(By.name("password")).sendKeys(password); 
	}

}
