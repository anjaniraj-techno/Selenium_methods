package com.mind;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_xpath {
	static String URL="https://www.flipkart.com/";

	public static void main(String[] args) {
		WebDriver dr=new FirefoxDriver();
		//dr.get("https://facebook.com/");
		dr.navigate().to(URL);
/*dr.findElement(By.cssSelector("[title='Men']>span")).click();
//dr.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[3]/a[@title='Men']")).click();
dr.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div[1]/ul/li[3]/ul/li/ul/li[2]/ul/li[2]/a[@title='T-Shirts']")).click();*/
List<WebElement> links=dr.findElements(By.xpath("//a"));
System.out.println(links.size());
for(WebElement s:links)
{
	System.out.println(s);
}
	}

}
