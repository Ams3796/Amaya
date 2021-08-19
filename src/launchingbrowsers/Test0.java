package launchingbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		System.out.print(driver.getCurrentUrl());
		driver.close();

	}

}
