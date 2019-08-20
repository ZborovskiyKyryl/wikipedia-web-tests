package com.telran.zborovskiy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SearchWikiTest {
    WebDriver driver;
    @Test
    public void setUp(){
        driver = new ChromeDriver();
        //driver = new InternetExplorerDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.name("search")).sendKeys("Zborovskiy");
    }
}
