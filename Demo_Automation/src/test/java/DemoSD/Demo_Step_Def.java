package DemoSD;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Demo_Step_Def
{
	
	WebDriver driver;
	@Given("^Launch Chrome and open Automation Website$")
	public void Launch_Chrome_and_open_Automation_Website() throws Throwable
	{
	   System.setProperty("webdriver.chrome.driver","D:\\cucumber\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.get("http://automationpractice.com/index.php");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}
	@When("^Create account under signin with email \"([^\"]*)\"and password \"([^\"]*)\"$")
	public void Create_account_under_signin(String user , String password) throws Throwable 
	{
		driver.findElement(By.xpath("//*[@class='login']")).click(); //User click on Signin option
		
		driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys(user); //User create account
		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click(); //user click on Submit button
		Thread.sleep(3000);
		
		 WebElement radio1 = driver.findElement(By.id("id_gender1")); //user click on gender option
		 radio1.click();	
		 
		driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("demo"); //user fill the first name
		
		
		driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("test"); //user fill the last name
		
	
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(password); //user fill the password
		
		
		Select dropdown1=new Select(driver.findElement(By.xpath("//*[@id='days']"))); //user fill the birth of the day 
		dropdown1.selectByIndex(4);
		Select dropdown2=new Select(driver.findElement(By.xpath("//*[@id='months']")));//user fill the birth of the month
		dropdown2.selectByIndex(4);
		Select dropdown3=new Select(driver.findElement(By.xpath("//*[@id='years']")));//user fill the birth of the year 
		dropdown3.selectByIndex(4);
		
		
		WebElement chekbox1 = driver.findElement(By.id("newsletter")); // user Sign up for our newsletter
		chekbox1.click();
		
		
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("demo"); //user fill the first name of address
		
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("test"); //user fill the last name of address
		
		driver.findElement(By.xpath("//*[@id='company']")).sendKeys("oakleaf"); //user fill the company name 
		
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("36001,oakleafinfoway"); //user fill the address1
		
		driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("Near jaypark"); //user fill the address1
		
		driver.findElement(By.xpath("//*[@id='city']")).sendKeys("california"); // user fill the city
		
		
		
		Select dropdown4=new Select(driver.findElement(By.xpath("//*[@id='id_state']"))); //user select the state
		dropdown4.selectByIndex(9);

		
		
		driver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("32006");//user fill the post code
		
		
		
		Select dropdown5=new Select(driver.findElement(By.xpath("//*[@id='id_country']")));//user select the country
		dropdown5.selectByIndex(1);
		
		
		
		driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("850-488-1234."); //user fill the home phone number
		
		driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("1-866-693-6748"); //user fill the mobile phone number
		
		driver.findElement(By.xpath("//*[@id='submitAccount']")).click(); //user click on submit button
		
		driver.findElement(By.xpath("//*[@title='Log me out']")).click(); //user click on Singout option
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(user); //user login with registered emailid and password
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
	}
	@And("^Select WOMEN product and add two qty$")
	public void Select_WOMEN_product_and_add_two_qty() throws InterruptedException
	{
		Actions action =new Actions(driver);
		WebElement Women=driver.findElement(By.xpath("//*[@title='Women']"));
		WebElement Blouses=driver.findElement(By.xpath("//*[@title='Blouses']"));
		
		action.moveToElement(Women); 
		Thread.sleep(1000);
		action.moveToElement(Blouses).click().perform();
		Thread.sleep(1000);
		
		Actions action1 =new Actions(driver);
		action1.moveToElement(driver.findElement(By.xpath("//img[@title='Blouse']")));
		Thread.sleep(1000);
		action1.moveToElement(driver.findElement(By.xpath("//a[@title='Add to cart']"))).click().perform();
		Thread.sleep(1000);
		
		 driver.navigate().refresh();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		 Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//a[@title='Add']")).click();
	}
	@Then("^Checkout process$")
	public void checkout_process() throws Throwable
	{
	    driver.findElement(By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']")).click();
	    driver.findElement(By.xpath("//*[@name='processAddress']")).click();
	    
	    WebElement chekbox2 = driver.findElement(By.id("uniform-cgv")); 
		chekbox2.click();
		
		driver.findElement(By.name("processCarrier")).click();
		
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		
		driver.findElement(By.xpath("//*[@class='button btn btn-default button-medium']")).click();
	}
	@Then("^click on order details$")
	public void click_on_order_details() throws Throwable
	{
		driver.findElement(By.xpath("//*[@title='My orders']")).click();
	
	}
}
