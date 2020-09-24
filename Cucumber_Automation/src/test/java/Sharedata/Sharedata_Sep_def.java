package Sharedata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sharedata_Sep_def 
{
	WebDriver driver;
	
	public Sharedata_Sep_def(Share_Class share)
	{
		driver = share.setup();
	}
	
	
	@Given("^The user is on OrangeHRM login page9$")
	public void The_user_is_on_OrangeHRM_login_page9() throws Throwable
	{
//	   System.setProperty("webdriver.chrome.driver","D:\\cucumber\\chromedriver_win32\\chromedriver.exe");
//	   driver =new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}

	@When("^User enter user \"([^\"]*)\" Username9$")
	public void User_enter_the_Username9(String Usernamae) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	}

	@And("^User enter password \"([^\"]*)\" password9$")
	public void User_enter_the_password9(String password) throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

	}
	@Then("^Click on Login button9$")
	public void click_on_Login_button9() throws Throwable 
	{
	    driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}
	

	
	

}
