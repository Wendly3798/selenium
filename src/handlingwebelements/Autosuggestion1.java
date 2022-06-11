//Handling Autosuggestion using findElements()
package handlingwebelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 1\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb=driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));	
		searchtb.sendKeys("wom");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		System.out.println(options.size());
		for(WebElement alloptions:options) {
			System.out.println(alloptions.getText());
		}
		driver.close();
		}
}
