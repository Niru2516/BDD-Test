package Multi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Multi_Sep_def 
{
	WebDriver driver;
	@Given("^The user is on OrangeHRM login page5$")
	public void the_user_is_on_OrangeHRM_login_page5() throws Throwable
	{
	   System.setProperty("webdriver.chrome.driver","D:\\cucumber\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}

	@When("^User enter user \"([^\"]*)\" Username5$")
	public void user_enter_the_Username5(String Usernamae) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	}

	@And("^User enter password \"([^\"]*)\" password5$")
	public void user_enter_the_password5(String password) throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

	}

	@Then("^Click on Login button5$")
	public void click_on_Login_button5() throws Throwable 
	{
	    driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}
	
	@And("^User click on Welcome option5$")
	public void User_click_on_Welcome_option5() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
	}
	@And("^User Click on Logout option5$") 
	public void User_click_on_Logout_option5()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}

	
}
