package com.mind;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {
static String URL="https://mail.rediff.com/cgi-bin/login.cgi";
	public static void main(String[] args) {
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to(URL);
		dr.findElement(By.xpath("//input[@value='Go']")).click();
		Alert al=dr.switchTo().alert();
		System.out.println(al.getText());
		al.accept();

	}

}
