package com.mind;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri_Recommendedjob_apply {
	
	static String URL="http://www.naukri.com";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver dr=new FirefoxDriver();
dr.manage().window().maximize();
dr.navigate().to(URL);
String handle=dr.getWindowHandle();
Set<String> handles=dr.getWindowHandles();
for(String hnd: handles)
{
	if(!hnd.equals(handle))
	{
		dr.switchTo().window(hnd);
	}
}
	System.out.println(dr.getTitle());
		dr.close();
		dr.switchTo().window(handle);
		System.out.println(dr.getTitle());
		Thread.sleep(5000);
dr.findElement(By.xpath(".//*[@id='login_Layer']/div")).click();
dr.findElement(By.xpath("//input[@id='eLogin' and @name='email']")).sendKeys("rronit899@gmail.com");
dr.findElement(By.xpath("//input[@id='pLogin' and @name='PASSWORD']")).sendKeys("Test@123");
dr.findElement(By.xpath("//input[@id='pLogin' and @name='PASSWORD']/following::button")).click();
Thread.sleep(15000);
WebElement li=dr.findElement(By.partialLinkText("Jobs"));
Actions ad=new Actions(dr);
ad.moveToElement(li).click().build().perform();
//dr.findElement(By.xpath("//a[@href='https://www.naukri.com/browse-jobs']")).click();
Thread.sleep(10000);
String parentWindow = dr.getWindowHandle();
Set<String> handles1 =  dr.getWindowHandles();
   for(String windowHandle  : handles1)
       {
       if(!windowHandle.equals(parentWindow))
          {
    	   dr.switchTo().window(windowHandle);
    	   dr.close();
    	  
          }  
       dr.switchTo().window(parentWindow);
       dr.findElement(By.xpath(".//*[@id='skill']/div[1]/div[2]/input")).sendKeys("Manual Testing");
       dr.findElement(By.xpath(".//*[@id='location']/div[1]/div[2]/input")).sendKeys("Pune");
       dr.findElement(By.xpath(".//*[@id='qsbFormBtn']")).click();
       dr.findElement(By.xpath("//li[@class='desig']")).click();
       }
       
          }

	}     
       
  // Thread.sleep(10000);
/*   String parentWindow1 = dr.getWindowHandle();
   Set<String> handles2 =  dr.getWindowHandles();
      for(String windowHandle1  : handles2)
          {
          if(!windowHandle1.equals(parentWindow1))
             {
             dr.switchTo().window(windowHandle1);
             dr.findElement(By.xpath(".//*[@id='trig1']")).click();
            
             }
          }
   */
	

