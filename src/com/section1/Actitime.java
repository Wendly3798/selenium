package com.section1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		Random r=new Random();
		int num=r.nextInt(10000);
		String expcustomername="priya";
		expcustomername=expcustomername+num;
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //login
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(2000);
        //tasks
        driver.findElement(By.id("container_tasks")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".title.ellipsis")).click();
        driver.findElement(By.className("createNewCustomer")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("newNameField")).sendKeys(expcustomername);
        driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("done");;
        Thread.sleep(2000);
        String actualcustomername=driver.findElement(By.cssSelector(".titleEditButtonContainer>div.title")).getText();
        
        
        if(actualcustomername.equals(expcustomername) )
        {
        	System.out.println("customer creation passed");
        }
        else
        {
        	System.out.println("customer creation failed");
        }
        driver.close();
	}
	
}
