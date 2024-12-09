package com.demo7.demo7;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitDemo {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
  	  WebDriver driver=new ChromeDriver();
  	  driver.get("https://www.google.com/"); // just for reference
  	  driver.manage().window().maximize();
  	  driver.quit();
  	  System.out.println("Info : Application is Launched successfully");
    
  }

}
