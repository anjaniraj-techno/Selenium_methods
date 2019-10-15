package com.mind;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mouse_events {

	static String URL="https://www.facebook.com";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver dr=new FirefoxDriver();
dr.navigate().to(URL);
JavascriptExecutor jse=((JavascriptExecutor)dr);
jse.executeScript("scroll(0, 250)");
	}

}
