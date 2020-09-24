package Multi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Google_Step_Def
{
	WebDriver driver;
	
	@Given("^The user is on Google page$")
	public void the_user_is_on_Google_page() throws Throwable
	{
	   System.setProperty("webdriver.chrome.driver","D:\\cucumber\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.get("https://www.google.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}
	@When("^User enter user search String$")
	public void User_enter_user_search_String()
	{
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Selenium");
	}
}
