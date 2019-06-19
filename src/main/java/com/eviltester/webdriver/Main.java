package com.eviltester.webdriver;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


public class Main {
    @Test


    public void  startDriver() throws AWTException {


        System.setProperty("webdriver.chrome.driver",
                "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();




        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Wakacje");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("btnK")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Last Minute")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[3]/div[2]/section/div[1]/div[1]/article/div/div/div[1]/a/figure/img")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);




    }

}


