//	Handling Mousehover using Actions class and then moveToElement() method followed by a default method perform()
//open ebay,mouse hover on electronics,click on xiaomi
package handlingwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32 1\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement electronics=driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
        
        Actions a=new Actions(driver);
        a.moveToElement(electronics).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Xiaomi']")).click();
        
        
	}

}
