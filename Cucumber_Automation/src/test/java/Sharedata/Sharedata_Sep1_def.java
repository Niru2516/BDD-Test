package Sharedata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.And;

public class Sharedata_Sep1_def 
{
	WebDriver driver;
	
	public Sharedata_Sep1_def(Share_Class share)
	{
		driver = share.setup();
	}

	
	@And("^User click on Welcome option9$")
	public void User_click_on_Welcome_option9() throws Exception
	{
		Thread.sleep(6000);
		driver.findElement(By.id("welcome")).click();
	
		
	}
	@And("^User Click on Logout option9$") 
	public void User_click_on_Logout_option9()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}

}
