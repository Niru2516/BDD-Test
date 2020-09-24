package Hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_Sep_def 
{
	WebDriver driver;
	
	@Before(order=1)
	public void beforsetup1()
	{
		System.out.println("In before1");
		System.setProperty("webdriver.chrome.driver","D:\\cucumber\\chromedriver_win32\\chromedriver.exe");
		   driver =new ChromeDriver();
	}
	@Before(order=2)
	public void beforsetup2()
	{
		System.out.println("In before2");
	}
	
	@Given("^The user is on OrangeHRM login page4$")
	public void the_user_is_on_OrangeHRM_login_page4() throws Throwable
	{
	   System.setProperty("webdriver.chrome.driver","D:\\cucumber\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}

	@When("^User enter user \"([^\"]*)\" Username4$")
	public void user_enter_the_Username4(String Usernamae) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	}

	@And("^User enter password \"([^\"]*)\" password4$")
	public void user_enter_the_password4(String password) throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

	}

	@Then("^Click on Login button4$")
	public void click_on_Login_button4() throws Throwable 
	{
	    driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}
	
	@And("^User click on Welcome option4$")
	public void User_click_on_Welcome_option4() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
	}
	@And("^User Click on Logout option4$") 
	public void User_click_on_Logout_option4()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
//	@Then("^Close browser$")
//	public void Close_browser()
//	{
//		driver.quit();
//		driver=null;
//	}
	
	@After(order=2)
	public void aftersetup1() 
	{	
		System.out.println("In After1");
		driver.quit();
		driver=null;
	}
	@After(order=1)
	public void aftersetup2() 
	{	
		System.out.println("In After2");
	}
}
