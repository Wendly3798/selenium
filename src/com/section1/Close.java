package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cowin.gov.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		}
    
}
