package com.simon.stock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author: qding
 */
public class StockTrading {
	public static void main(String[] args) {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.binary", "C:\\Users\\qding\\AppData\\Local\\Google\\Chrome\\");
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("http://finance.sina.com.cn/");
		WebElement e = driver.findElement(By.id("cheadUserInfo"));
		WebElement lnkLogin = e.findElement(By.className("cheadLoginBtn"));
		lnkLogin.click();

		StockTrading.wait(2000);
		WebElement usrName = driver.findElement(By.id("username"));
		usrName.sendKeys("simon511sz");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("bluelily22");
		pwd.submit();


	}

	public static void wait(int n) {
		long t0, t1;
		t0 = System.currentTimeMillis();
		do {
			t1 = System.currentTimeMillis();
		}
		while (t1 - t0 < n);
	}
}
