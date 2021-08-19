package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://luxire.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		WebElement ele = driver.findElement(By.xpath("(//a[@class='site-nav__link'])[4]"));
        Actions a=new Actions(driver);
        a.moveToElement(ele).perform();
       Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Noragi']")).click();
        driver.close();
	}

}
