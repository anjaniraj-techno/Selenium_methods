package com.mind;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Dropdown {
	static String URL="https://www.facebook.com/";

	public static void main(String[] args) {
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to(URL);
/*		WebElement elem = dr.findElement(By.xpath(".//*[@id='month']"));
		List<WebElement> values=elem.findElements(By.tagName("option"));
//System.out.println(values.size());
for(WebElement s:values)
{
	System.out.println(s.getText());
}
*/
		
		//COde to Verify isDisplayed or Enabled or Disabled
		
	boolean fn=dr.findElement(By.xpath(".//*[@id='month']")).isDisplayed();
	
	if(fn==true)
	{
		System.out.println("The element is visible");
	}
	else
	{
		System.out.println("Element is not visible");
	}
	
	boolean fname = dr.findElement(By.xpath(".//*[@id='u_0_7']")).isEnabled();
	if(fname==true)
	{
	System.out.print("fname is enabled");
	}
	else
	{
		System.out.print("fname is Disabled");
	}
	}


}
