package handlingwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 1\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("svg.gb_Te")).click();
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);

		WebElement clndr=driver.findElement(By.xpath("//a[@href='https://calendar.google.com/calendar']"));
        clndr.click();
		driver.switchTo().defaultContent();
		driver.close();
		
	}
}
