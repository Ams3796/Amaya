package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		

		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("identify_email")).sendKeys("68793");
		driver.findElement(By.id("did_submit")).click();
	}

}
