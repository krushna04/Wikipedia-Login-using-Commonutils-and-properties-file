package com;

import commonUtils.commonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Properties;

public class wikipediaLogin {
    public static void main(String[] args) throws InterruptedException {
        commonUtils obj = new commonUtils();
        Properties prop = obj.commonUtilsFunction("C:\\Users\\Krushnakant\\Desktop\\Automation\\AmazonLogin\\src\\main\\java\\config\\config.properties");
        WebDriver driver = new EdgeDriver();
        driver.get(prop.getProperty("url"));
        driver.findElement(By.xpath(prop.getProperty("loginButton"))).click();
        driver.findElement(By.id(prop.getProperty("loginID"))).sendKeys(prop.getProperty("userID"));
        driver.findElement(By.id(prop.getProperty("loginPassword"))).sendKeys(prop.getProperty("userPassword"));
        driver.findElement(By.id(prop.getProperty("loginBtn"))).click();
        Thread.sleep(3000);
        driver.close();
    }
}
