package Background;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class  Background_Sep_def 
{
	WebDriver driver;
	@Given("^The user is on OrangeHRM login page1$")
	public void the_user_is_on_OrangeHRM_login_page1() throws Throwable
	{
	   System.setProperty("webdriver.chrome.driver","D:\\cucumber\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}

	@When("^User enter the Username1$")
	public void user_enter_the_Username1() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	}

	@And("^User enter the password1$")
	public void user_enter_the_password1() throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

	}

	@Then("^Click on Login button1$")
	public void click_on_Login_button1() throws Throwable 
	{
	    driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}
	
	@When("^User click on Welcome option1$")
	public void User_click_on_Welcome_option1() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
	}
	@Then("^User Click on Logout option1$") 
	public void User_click_on_Logout_option1()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
}
