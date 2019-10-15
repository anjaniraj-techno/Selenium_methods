package com.mind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Select {
		// TODO Auto-generated method stub
		static String URL="https://www.facebook.com/";

		public static void main(String[] args) {
			WebDriver dr=new FirefoxDriver();
			//dr.get("https://facebook.com/");
			dr.navigate().to(URL);
			Select ss=new Select(dr.findElement(By.xpath(".//*[@id='day']")));
			//ss.selectByIndex(4);
			//ss.selectByValue("7");
			ss.selectByVisibleText("9");
	}

}
