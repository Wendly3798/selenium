package bharanimam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginscenario {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32 1\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("a.content.tasks")).click();
        driver.findElement(By.cssSelector(".title.ellipsis")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector(".item.createNewCustomer")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("scott");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
        String crl =driver.getCurrentUrl();
        System.out.println(crl);
        if(crl.equals("https://demo.actitime.com/tasks/tasklist.do"))
        {
     	   System.out.println("pass:customer name is entered");
        }
        else
        {
     	   System.out.println("fail");
        }
             
       driver.close();
	}

}
