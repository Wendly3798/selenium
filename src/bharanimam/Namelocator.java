package bharanimam;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namelocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32 1\\\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");//name locator name="pwd"
        driver.findElement(By.id("loginButton")).click();
	}
}
