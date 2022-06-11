//scrollbar
//open amazon,take scrollbar to laptops 
package handlingwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 1\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement SOA=driver.findElement(By.xpath("//a[text()=\"Sell on Amazon\"]"));
		Point loc=SOA.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy("+x+","+y+")");
		 Thread.sleep(3000);
		 SOA.click();
		 
		 driver.close();
	}

}
