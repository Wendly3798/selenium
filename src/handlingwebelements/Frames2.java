//Assignment scenario :open the browser,enter the url of snapdeal,mousehover on signin,click on login button,
//switch the control to the frame and enter the mobile number,switch the controlback from the frame &write/search for phone in searchbox

package handlingwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32 1\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signin=driver.findElement(By.xpath("//span[text()=\"Sign In\"]"));
	        
	       Actions a=new Actions(driver);
	       a.moveToElement(signin).perform();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")).click();
	       
	       driver.switchTo().frame(0);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("8375689022");
			driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("phone");
			driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
			Thread.sleep(3000);
			driver.close();

	}
	
}
