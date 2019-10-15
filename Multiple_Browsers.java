package com.mind;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Multiple_Browsers {
	static String URL="https://mail.rediff.com/cgi-bin/login.cgi";

	public static void main(String[] args) {
//Code for Chrome Browser 
		
	/*	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
WebDriver dr=new ChromeDriver();
dr.manage().window().maximize();
dr.navigate().to(URL);
*/
		
//Code for Firefox Browser 
System.setProperty("webdriver.geckodriver.driver", "D://geckodriver.exe");
WebDriver dr=new FirefoxDriver();
dr.manage().window().maximize();
dr.navigate().to(URL);
String handle=dr.getWindowHandle();
Set<String> handles=dr.getWindowHandles();


	}

}
