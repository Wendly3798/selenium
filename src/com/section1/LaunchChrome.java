package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}
}
