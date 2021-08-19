package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Parallel {
	public WebDriver driver;
	@Parameters({"BrowserName"})
	@Test
	public void tc1(String browser) throws InterruptedException
	{
	      if(browser.equals("chrome"))
	      {
	    	  driver=new ChromeDriver();
	      }
	      else
	      {
	    	  driver=new FirefoxDriver();
	      }
	   
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Create a Page")).click();
    driver.findElement(By.xpath("//div[text()='Get Started']")).click();
    Reporter.log(driver.getTitle(),true);
    
    Reporter.log(driver.getCurrentUrl(),true);
}

@AfterMethod
public void CloseApp() {
	driver.close();
}
}

