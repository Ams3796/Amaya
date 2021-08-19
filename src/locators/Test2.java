package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("anbuamaya1996@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Amaya3796");
		driver.findElement(By.name("login")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
        driver.close();
		
		

	}

}
