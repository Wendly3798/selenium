//Handling Doubleclick using Actions class and doubleclick() method followed by a default method perform()
//open demoapp.skillrary,double click on +(plus btn) beside add to cart,number should be increased to 2 from 1
package handlingwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Douleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32 1\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement plusbtn=driver.findElement(By.id("add"));
       Thread.sleep(5000);
       Actions a=new Actions(driver);
       a.doubleClick(plusbtn).perform();
	}

}
