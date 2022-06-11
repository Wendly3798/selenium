//saami searching in youtube & autosuggestion handling in youtube
package handlingwebelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		WebElement srch=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		srch.sendKeys("saami");
	
        Thread.sleep(2000);

		List<WebElement>  options=driver.findElements(By.xpath("//div[@class='sbse']"));//inspect the first autosuggestion and all the other should have the same attribute like class="sbct"
        Thread.sleep(3000);

		 System.out.println(options.size());
		for(WebElement alloptions:options)  //for(data_type variable:collection) for each loop syntax
		{
			System.out.println(alloptions.getText());
		}
		driver.close();
		}
	}


