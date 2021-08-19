package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase2 {
	public WebDriver driver;
	@BeforeMethod
	public void OpenApp(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void login() throws InterruptedException {
	driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Forgotten password?")).click();
	driver.findElement(By.id("identify_email")).sendKeys("jskdhisa");
	driver.findElement(By.id("did_submit")).click();
	Reporter.log(driver.getTitle(),true);
	Reporter.log(driver.getCurrentUrl(),true);
	}
	
	@AfterMethod
	public void CloseApp() {
		driver.close();
	}
}
