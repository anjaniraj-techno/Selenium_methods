package com.mind;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handing_Tabs {
static String URL="https://www.facebook.com";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver dr=new FirefoxDriver();
dr.navigate().to(URL);
dr.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"/t");
dr.get("https://www.google.com");
dr.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");
dr.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"/N");
	}

}
