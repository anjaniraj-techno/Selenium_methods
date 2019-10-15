package com.mind;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri_Update_profile {
	static String URL="http://www.naukri.com";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver dr=new FirefoxDriver();
dr.navigate().to(URL);
dr.manage().window().maximize();
String handle=dr.getWindowHandle();
Set<String> handles=dr.getWindowHandles();
for(String hnd: handles )
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
Thread.sleep(10000);
dr.findElement(By.xpath(".//*[@id='leftNav_updateProfile']/ul/li/a[4]")).click();
dr.findElement(By.xpath(".//*[@id='deleteLink1']")).click();
dr.findElement(By.xpath(".//*[@id='deleteLayer']/div[3]/div/div[2]/button")).click();
WebElement r=dr.findElement(By.xpath(".//*[@id='confirmMessage']"));
System.out.println(r.getText());
Thread.sleep(5000);
dr.findElement(By.xpath(".//*[@id='uploadLink']")).click();
Thread.sleep(10000);
dr.findElement(By.xpath(".//*[@id='attachCV']")).click();
/*Robot rbt=new Robot();
rbt.keyPress(KeyEvent.VK_D);
rbt.keyRelease(KeyEvent.VK_D);
rbt.keyPress(KeyEvent.VK_SHIFT);
rbt.keyRelease(KeyEvent.VK_SHIFT);
rbt.keyPress(KeyEvent.VK_SEMICOLON);
rbt.keyRelease(KeyEvent.VK_SEMICOLON);
rbt.keyPress(KeyEvent.VK_BACK_SLASH);
rbt.keyRelease(KeyEvent.VK_BACK_SLASH);
rbt.keyPress(KeyEvent.VK_R);
rbt.keyRelease(KeyEvent.VK_R);
rbt.keyPress(KeyEvent.VK_E);
rbt.keyRelease(KeyEvent.VK_E);
rbt.keyPress(KeyEvent.VK_S);
rbt.keyRelease(KeyEvent.VK_S);
rbt.keyPress(KeyEvent.VK_U);
rbt.keyRelease(KeyEvent.VK_U);
rbt.keyPress(KeyEvent.VK_M);
rbt.keyRelease(KeyEvent.VK_M);
rbt.keyPress(KeyEvent.VK_E);
rbt.keyRelease(KeyEvent.VK_E);
rbt.keyPress(KeyEvent.VK_DECIMAL);
rbt.keyRelease(KeyEvent.VK_DECIMAL);
rbt.keyPress(KeyEvent.VK_D);
rbt.keyRelease(KeyEvent.VK_D);
rbt.keyPress(KeyEvent.VK_O);
rbt.keyRelease(KeyEvent.VK_O);
rbt.keyPress(KeyEvent.VK_C);
rbt.keyRelease(KeyEvent.VK_C);
rbt.keyPress(KeyEvent.VK_X);
rbt.keyRelease(KeyEvent.VK_X);
rbt.keyPress(KeyEvent.VK_ENTER);
rbt.keyRelease(KeyEvent.VK_ENTER);*/
Runtime.getRuntime().exec("C:\\Users\\Rahul\\Desktop\\Test_Autoitcode.exe");
Thread.sleep(10000);
dr.findElement(By.xpath(".//*[@id='editForm']/div[7]/button")).click();
WebElement d=dr.findElement(By.xpath(".//*[@id='confirmMessage']"));
System.out.println(d.getText());

	}

}
