package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signin/v2/challenge/pwd?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Dwm&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Dwm&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward&TL=AM3QAYZm4yz-u2ogvT-ZBGOLs-UmE4z4otm9y02m1UJm0dUfxp0G9IZ4Z9Ic49oN");
        driver.findElement(By.cssSelector("input[autocomplete='current-password']")).sendKeys("83744113");
	}

}
