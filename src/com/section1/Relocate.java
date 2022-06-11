package com.section1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relocate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cowin.gov.in/");
		driver.manage().window().setPosition(new Point(700,300));
		Thread.sleep(3000);
	}

}
