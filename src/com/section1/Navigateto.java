package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateto {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.cowin.gov.in/");
		driver.navigate().to("https://www.ebay.com/");
		
		
	}

}
