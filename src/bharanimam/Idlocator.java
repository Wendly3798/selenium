//id locator
package bharanimam;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32 1\\\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.id("username")).sendKeys("admin");//attribute value is username as the field is username then we have to provide input then provide admin in that field using sendkeys.  
	}

}