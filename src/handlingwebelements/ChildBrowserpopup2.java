package handlingwebelements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserpopup2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32 1\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("swaroopa");
		String parent=driver.getWindowHandle();
		Set<String>child=driver.getWindowHandles();
		ArrayList a=new ArrayList();
		for(String b:child) {
			a.add(b);
		}
		a.indexOf(1);
		
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(3000);

			driver.quit();

		 
	}

}
