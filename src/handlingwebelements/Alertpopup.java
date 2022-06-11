package handlingwebelements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32 1\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		Alert a = driver.switchTo().alert();
		a.dismiss();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
}



