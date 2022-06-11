//Handling Drag and Drop using Actions class and dragAndDrop() method followed by default method perform()
//open the url,drag and drop block 1,block 4 
package handlingwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32 1\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement block1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
        WebElement block4=driver.findElement(By.xpath("//h1[text()='Block 4']"));
        Thread.sleep(5000);
        Actions a=new Actions(driver);
        a.dragAndDrop(block1, block4).perform();

	}

}
