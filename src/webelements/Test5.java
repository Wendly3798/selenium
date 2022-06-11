//using isEnabled() search for login button webelement and if button is enabled then click on that button
package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement btn =driver.findElement(By.id("loginButton"));
		if(btn.isEnabled())
		{
			System.out.println("pass:element is enabled");
			btn.click();
		}
		else
		{
			System.out.println("fail:element is not enabled");
		}
	}

}

