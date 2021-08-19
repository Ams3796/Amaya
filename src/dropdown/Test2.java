package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Documents/New%20folder%20(2)/dropdown.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
		WebElement dd=driver.findElement(By.name("url"));
		Select s=new Select(dd);
		s.selectByIndex(0);
		Thread.sleep(5000);
		s.selectByValue("2");
		Thread.sleep(5000);
		s.selectByVisibleText("iecream");
		
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		for(WebElement b:option)
		{
			System.out.println(b.getText());
		}
		
		s.deselectByIndex(0);
		s.deselectByValue("2");
		s.deselectByValue("icecream");
		driver.close();
		
		}

	}


