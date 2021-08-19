package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.name("addresstype"));
		Select s=new Select(dropdown);
		s.selectByIndex(1);
		
		driver.findElement(By.linkText("Selenium Training")).click();
		
		WebElement ele1 = driver.findElement(By.id("add"));
		Actions a=new Actions(driver);
		a.doubleClick(ele1).perform();
	}

}
