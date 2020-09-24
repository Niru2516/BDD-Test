package MultiscenarioSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MutiScenario_Sep_def 
{
	WebDriver driver;
	@Given("^The user is on OrangeHRM login page6$")
	public void the_user_is_on_OrangeHRM_login_page6() throws Throwable
	{
	   System.setProperty("webdriver.chrome.driver","D:\\cucumber\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}

	@When("^User enter the Username6$")
	public void user_enter_the_Username6() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	}

	@And("^User enter the password6$")
	public void user_enter_the_password6() throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

	}

	@Then("^Click on Login button6$")
	public void click_on_Login_button6() throws Throwable 
	{
	    driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}
	
	@When("^User click on Welcome option6$")
	public void User_click_on_Welcome_option6() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
	}
	@Then("^User Click on Logout option6$") 
	public void User_click_on_Logout_option6()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
}
