package Datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Datadriven_Sep_def 
{
	WebDriver driver;
	@Given("^The user is on OrangeHRM login page2$")
	public void the_user_is_on_OrangeHRM_login_page2() throws Throwable
	{
	   System.setProperty("webdriver.chrome.driver","D:\\cucumber\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}

	@When("^User enter the user \"([^\"]*)\" Username2$")
	public void user_enter_the_Username2(String Username) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Username);
		
	}

	@And("^User enter the password \"([^\"]*)\" password2$")
	public void user_enter_the_password2(String password) throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	

	} 

	@And("^Click on Login button2$")
	public void click_on_Login_button2() throws Throwable 
	{
	    driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}
	@Then("^Close browser2$")
	public void Close_browser2()
	{
		driver.quit();
		driver=null;
	}
}
