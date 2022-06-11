package handlingwebelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32 1\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement drpdwn=driver.findElement(By.id("gh-cat"));
		Thread.sleep(3000);
		Select s=new Select(drpdwn);
		//s.selectByIndex(8);
		//s.selectByValue("11450");
		s.selectByVisibleText("Clothing, Shoes & Accessories");//used to select a value from dropdown
		
		List<WebElement>alloptions=s.getOptions();//this method is used to get all options of dropdown
		System.out.println(alloptions.size());
		
		for(WebElement b:alloptions)//for-each loop
		{
			System.out.println(b.getText());//this method fetches the text of all dropdown values
		}
		driver.close();
		System.out.println(s.isMultiple());//false coz it is single select dropdown
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		else
		{
			System.out.println("single selectbdropdown");
		}
	}
	

}
