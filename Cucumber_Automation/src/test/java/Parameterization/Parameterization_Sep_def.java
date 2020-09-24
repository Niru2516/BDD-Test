package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parameterization_Sep_def 
{
	WebDriver driver;
	@Given("^The user is on OrangeHRM login page7$")
	public void the_user_is_on_OrangeHRM_login_page7() throws Throwable
	{
	   System.setProperty("webdriver.chrome.driver","D:\\cucumber\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}

	@When("^User enter user \"([^\"]*)\" Username7$")
	public void user_enter_the_Username7(String Usernamae) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	}

	@And("^User enter password \"([^\"]*)\" password7$")
	public void user_enter_the_password7(String password) throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

	}

	@Then("^Click on Login button7$")
	public void click_on_Login_button7() throws Throwable 
	{
	    driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}
	
	@When("^User click on Welcome option7$")
	public void User_click_on_Welcome_option7() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
	}
	@Then("^User Click on Logout option7$") 
	public void User_click_on_Logout_option7()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
}
