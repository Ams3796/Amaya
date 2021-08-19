package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class='gb_C']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@class='CgwTDb'])[5]")).click();
		

	}

}
