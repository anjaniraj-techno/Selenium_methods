package com.mind;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Naukri_Browse_Company {
			
			static String URL="https://www.naukri.com/";

			public static void main(String[] args) throws Exception {
				// TODO Auto-generated method stub
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize() ;
		dr.navigate().to(URL);
//dr.findElement(By.xpath("html/body/div[2]/div/ul/li[3]/a")).click();
WebElement li=dr.findElement(By.partialLinkText("C"));
//li.click();
//Action class for mouse hover
Actions ad=new Actions(dr);
ad.moveToElement(li).click().build().perform();

	}

}
