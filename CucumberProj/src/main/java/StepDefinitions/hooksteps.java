package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class hooksteps {
	//Global
	@Before(order=0)
	public void before()
	{
		System.out.println("Browser code");
	}
	@After(order=0)
	public void after()
	{
		System.out.println("closebrowser code");
	}
	@Before(order=1)
	public void fbefore()
	{
		System.out.println("fBrowser code");
	}
	@After(order=1)
	public void fafter()
	{
		System.out.println("fclosebrowser code");
	}
	//Local
	@Before("@First,@Third")
	public void beforefirst()
	{
		System.out.println("beforefirst");
	}
	@After("@First")
	public void afterfirst()
	{
		System.out.println("afterfirst");
	}
	
	@Given("^Mercury hooks login scenario$")
	public void mercury_hooks_login_scenario() throws Throwable {
		System.out.println("hook1");
	}
	

	@Given("^Mercury hooks itinery scenario$")
	public void mercury_hooks_itinery_scenario() throws Throwable {
		System.out.println("hook2");
	}
	

	@Given("^hooks scenario$")
	public void hooks_scenario() throws Throwable {
		System.out.println("hook3"); 
	}

	@Given("^hooks of \"([^\"]*)\" and \"([^\"]*)\"$")
	public void hooks_of_and(String username, String password) throws Throwable {
		System.out.println(username + password); 
	}
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		System.out.println("background");
	}



}
