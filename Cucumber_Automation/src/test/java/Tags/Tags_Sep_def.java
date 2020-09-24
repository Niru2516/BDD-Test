package Tags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tags_Sep_def 
{
	WebDriver driver;

	@Given("^The user is on OrangeHRM login page10$")
	public void the_user_is_on_OrangeHRM_login_page10() throws Throwable
	{
	   System.setProperty("webdriver.chrome.driver","D:\\cucumber\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}

	@When("^User enter user \"([^\"]*)\" Username10$")
	public void user_enter_the_Username10(String Usernamae) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	}

	@And("^User enter password \"([^\"]*)\" password10$")
	public void user_enter_the_password10(String password) throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

	}

	@Then("^Click on Login button10$")
	public void click_on_Login_button10() throws Throwable 
	{
	    driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}
	
	@And("^User click on Welcome option10$")
	public void User_click_on_Welcome_option10() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
	}
	@And("^User Click on Logout option10$") 
	public void User_click_on_Logout_option10()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
	@Then("^close browser10$")
	public void close_browser10() throws Throwable 
	{
		driver.quit();
		driver=null;
	}

	
	
	
}
