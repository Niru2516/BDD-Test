package DataTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class  DataTable_Sep_def 
{
	WebDriver driver;
	@Given("^User is on OrangeHRM login Page3$")
	public void the_user_is_on_OrangeHRM_login_page3() throws Throwable
	{
	   System.setProperty("webdriver.chrome.driver","D:\\cucumber\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}

	@When("^User enter the Username3$")
	public void user_enter_the_Username3() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	}

	@And("^User enter the password3")
	public void user_enter_the_password3() throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

	}

	
	@Then("^click on login button3$")
	public void click_on_Login_button3() throws Throwable 
	{
	    driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}
	
	
	@When("^Enter follwing data3$")
	public void Enter_following_data3(DataTable table)
	{
		 List<List<String >>data = table.raw();
		 
		 String values1=data.get(0).get(0);
		 String values2=data.get(0).get(1);
		 
			 
		
		 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(values1);
		 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(values2);
		 
	}
}
