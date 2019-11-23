package com.company;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        //System.out.println("Hello World");
        //WebDriver obj = new ChromeDriver();
                //obj.get("https://acme-qa.everreal.co/accounts/login");


        ///******Login & selecting appointment*****////

         WebDriver driver = new ChromeDriver();
            driver.get("https://acme-qa.everreal.co/app/tenant/viewings/47500516-7852-4cb8-9f99-fd6e9ea78307");
        WebElement elm1 = driver.findElement(By.id("username"));
        elm1.sendKeys("theusamah@gmail.com");
        WebElement elm2 = driver.findElement(By.id("password"));
        elm2.sendKeys("Test@123");
       WebElement elm3 = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[2]/div/div/div/div[2]/div/div/form/button/span[1]/span"));
        elm3.click();
        Thread.sleep(30000);
        WebElement elm4 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div[1]/div[2]/div/div[2]/div[3]/div[1]/div/div[1]/div"));
        elm4.click();
        Thread.sleep(10000);
        WebElement elm5 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div[1]/div[2]/div/div[2]/div[4]/div"));
        elm5.click();

    }
}
