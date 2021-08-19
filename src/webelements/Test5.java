package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement fname = driver.findElement(By.name("username"));
        if(fname.isDisplayed())
        {
        	System.out.println("Pass:Displayed");
        }
        else
        {
        	System.out.println("Fail:Not displayed");
        }
        WebElement radiobtn = driver.findElement(By.name("remember"));
        if(radiobtn.isSelected()) {
        	System.out.println("Pass:Selected");
        }
        else
        {
        	System.out.println("Fail:Notselected");
        }
        WebElement enablebtn = driver.findElement(By.xpath("//div[text()='Login ']"));
       if(enablebtn.isEnabled()) {
    	   System.out.println("Pass:Enabled");  
       }
       else
       {
    	   System.out.println("Fail:Not enabled");
	}
	}

}
