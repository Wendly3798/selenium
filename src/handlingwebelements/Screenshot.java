package handlingwebelements;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32 1\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		//Step:1 typcasting
	TakesScreenshot ts=(TakesScreenshot)driver;	
	
	//Step:2 access the method and store it RAM
	File src = ts.getScreenshotAs(OutputType.FILE);

	//Step:3 specify the location
	File dest=new File("./photo/amazon2.png");
	
	//Step:4 copy paste from RAM To specify location
	FileUtils.copyFile(src, dest);
	
	driver.close();
	}

}
