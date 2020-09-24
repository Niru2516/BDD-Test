package Multi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Automation_Step_Def 
{
WebDriver driver;
	
	@Given("^The user is on Demo page$")
	public void the_user_is_on_Demo_page() throws Throwable 
	{
		 System.setProperty("webdriver.chrome.driver","D:\\cucumber\\chromedriver_win32\\chromedriver.exe");
		   driver =new ChromeDriver();
		   driver.get("http://demo.automationtesting.in/Register.html");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
	}
	@When("^User enter First name$")
	public void user_enter_First_name() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Java");
	}
	
	@And("^User enter Last name$")
	public void User_enter_Last_name()throws Throwable 
	{
		driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Welcome");
	}
}
