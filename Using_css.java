package com.mind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Using_css {

		static String URL="https://www.facebook.com/";
		public static void main(String[] args) {
		WebDriver dr=new FirefoxDriver();
		//dr.get("https://facebook.com/");
		dr.navigate().to(URL);
		dr.findElement(By.xpath("//input[@id='u_0_9']")).sendKeys("Anshuman");
		dr.findElement(By.cssSelector("#u_0_c")).sendKeys("9545528440");
		dr.findElement(By.xpath("//a[text()='Create a Page' and @href='/pages/create/?ref_type=registration_form']")).click();
	}

}
