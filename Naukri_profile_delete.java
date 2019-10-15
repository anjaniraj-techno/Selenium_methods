package com.mind;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri_profile_delete {

	static String URL="https://login.naukri.com/mnj/delete?&utm_campaign=FTD&utm_medium=mailer&utm_source=WelcomeMailer";
	//static String URL="https://www.gmail.com";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver dr=new FirefoxDriver();
dr.manage().window().maximize() ;
dr.navigate().to(URL);
//dr.findElement(By.xpath(".//*[@id='login_Layer']")).click();
dr.findElement(By.xpath("//input[@id='emailTxt']")).sendKeys("asd11aassddf@gmail.com");
dr.findElement(By.xpath("//input[@id='pwd1']")).sendKeys("Test@123");
Thread.sleep(8000);
dr.findElement(By.xpath("//input[@id='pwd1']/following::input[@id='sbtLog']")).click();
Thread.sleep(10000);
//dr.navigate().to("https://login.naukri.com/mnj/delete?&utm_campaign=FTD&utm_medium=mailer&utm_source=WelcomeMailer&id=ece112d08e0ed155431a2f36d7584b0a37f1316ebd889ae1fcc7540947ce68afa17faea29e95a5a4");
dr.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@123");
dr.findElement(By.xpath("//button[@name='DELETE' and @value='Save Changes']")).click();
	

//---------------------------------------------------------------------------------------------
//using Gmail.com
//dr.findElement(By.xpath("//a[@data-g-label='Sign in']")).click();
/*dr.findElement(By.xpath("//input[@id='identifierId' and @type='email']")).sendKeys("rronit899@gmail.com");
dr.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
Thread.sleep(5000);
dr.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
dr.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
Thread.sleep(30000);
JavascriptExecutor jse = (JavascriptExecutor)dr;
jse.executeScript("document.getElementsByName('body')[0].setAttribute('type', 'text');");
dr.findElement(By.xpath(".//*[@id='gs_taif50']")).clear();
dr.findElement(By.xpath(".//*[@id='gs_taif50']")).sendKeys("Please note that you will receive jobs matching your profile on rronit899@gmail.com.");
dr.findElement(By.xpath(".//*[@id='gs_taif50']")).sendKeys("Please note that you will receive jobs matching your profile on rronit899@gmail.com.");
dr.findElement(By.xpath(".//*[@id='gbqfb']")).click();
dr.findElement(By.xpath(".//*[@id=':54']")).click();
dr.findElement(By.xpath(".//*[@id=':6b']/div[2]/table/tbody/tr[8]/td[2]/a[1]")).click();
dr.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"/t");
*/
}
}
