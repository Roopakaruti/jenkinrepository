package com.training.testjenkins;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Login_Test {
	private WebDriver driver;
    @Test
    public void LoginTestCase() {
        driver.findElement(By.name("q")).sendKeys("manzoor");
        
    }
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver75.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println("searching");
    }
    @AfterTest
    public void afterTest() {
        driver.close();
        
    }
}