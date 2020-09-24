package sample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Step_def 
{
	WebDriver driver;
	@Given("^The user is on OrangeHRM login page8$")
	public void the_user_is_on_OrangeHRM_login_page8() throws Throwable
	{
	   System.setProperty("webdriver.chrome.driver","D:\\cucumber\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}

	@When("^User enter the Username8$")
	public void user_enter_the_Username8() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	}

	@When("^User enter the password8$")
	public void user_enter_the_password8() throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

	}

	@Then("^Click on Login button8$")
	public void click_on_Login_button8() throws Throwable 
	{
	    driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}
	
}
