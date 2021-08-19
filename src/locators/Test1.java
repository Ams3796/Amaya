package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");

				
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.partialLinkText("password?")).click();
		driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("lkjhtfytgsjx");
		driver.findElement(By.id("forgetPasswordButton")).click();

}
}