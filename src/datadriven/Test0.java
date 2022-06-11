package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test0 {
	
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32 1\\chromedriver.exe");

		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./data.properties");
		p.load(fis);
		
		WebDriver driver=new ChromeDriver();;
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(p.getProperty("password"));		
	}

}
