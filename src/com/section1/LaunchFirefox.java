package com.section1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}

}
