package com.staragile.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Devil\\Documents\\drivers\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/");

		String title = driver.getTitle();
		System.out.println(title);

		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);

		String pagesource = driver.getPageSource();
		System.out.println(pagesource);

		driver.close();

	}

}
