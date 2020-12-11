package com.kundu.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/rashmi.n/Documents/Softwares/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        WebElement element = driver.findElement(By.name("q"));
        driver.manage().window().maximize();
        Thread.sleep(120);
        element.sendKeys("java");
        element.submit();
        driver.close();
    }
}
