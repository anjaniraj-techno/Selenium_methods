package com.mind;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
static String URL="https://jqueryui.com/draggable/";
	public static void main(String[] args) {
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.navigate().to(URL);
		String title=dr.getTitle();
		System.out.println(title);
	/*	List<WebElement> fn=dr.findElements(By.tagName("iframe"));
		System.out.println(fn.size());
		for(WebElement s:fn)
		{
		System.out.println(s);
		}*/
		dr.switchTo().frame(0);
		WebElement d=dr.findElement(By.xpath(".//*[@id='draggable']/p"));
	
		System.out.println(d.getText());
		
		Actions act=new Actions(dr);
		act.moveToElement(d).dragAndDropBy(d,80,80).build().perform();
		
		System.out.println("Moved to the 80,80 ");
		
		//fn.getText();
		
		

	}

}
