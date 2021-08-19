package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
		WebElement dropdown=driver.findElement(By.name("url"));
		Select s=new Select(dropdown);
		s.selectByIndex(1);
		Thread.sleep(5000);
		s.selectByValue("search-alias=arts-crafts-intl-ship");
		Thread.sleep(5000);
		s.selectByVisibleText("Baby");
		
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		for(WebElement b:option)
		{
			System.out.println(b.getText());
		}
		driver.close();
		}
		
		

	}

