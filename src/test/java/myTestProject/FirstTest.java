package myTestProject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;




import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;


public class FirstTest {
	
	private WebDriver driver;
	private String baseUrl;
	
	
	@Before
	public void setup() throws Exception {
		
		driver = new FirefoxDriver();
		baseUrl = "http://www.ebay.co.uk/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	}
	
	@After 
	public void teardown() throws Exception {
		driver.quit();
		
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get (baseUrl);
		driver.findElement(By.id("gh-la"));
		
	}
	
}	
	


