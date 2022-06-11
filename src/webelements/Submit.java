//Open amazon with url,type for phone in searchbox,click on search bar/icon after typing phone in searchbox
//submit works same as click(),but we have to use submit only when we have type="submit" after inspect.
package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.amazon.in/s?k=phone&ref=nb_sb_noss"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
