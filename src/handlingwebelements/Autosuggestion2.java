//ope browser,enter google.com url,type seleni in search textbox,then find the count of autosuggestions and those texts
package handlingwebelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32 1\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement searchtb=driver.findElement(By.name("q"));
        searchtb.sendKeys("seleni");
        
        Thread.sleep(1000);
 List<WebElement>  options=driver.findElements(By.xpath("//li[@class='sbct']"));//inspect the first autosuggestion and all the other should have the same attribute like class="sbct"
 System.out.println(options.size());
for(WebElement alloptions:options)  //for(data_type variable:collection) for each loop syntax
{
	System.out.println(alloptions.getText());
}
driver.close();
}
	}
