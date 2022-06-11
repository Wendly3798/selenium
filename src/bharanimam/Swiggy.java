package bharanimam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32 1\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Bangalore, Karnataka, India']")).click();
		
		driver.findElement(By.xpath("//span[text()='FIND FOOD']")).click();
		
	}

}
