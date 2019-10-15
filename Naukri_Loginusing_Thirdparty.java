package com.mind;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri_Loginusing_Thirdparty {

		static String URL="https://login.naukri.com/nLogin/Login.php?msg=0&URL=http%3A%2F%2Fmy.naukri.com";

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			//System.setProperty("webdriver.geckodriver.driver", "D://geckodriver.exe");
			WebDriver dr=new FirefoxDriver();
			dr.manage().window().maximize();
			dr.navigate().to(URL);
			dr.findElement(By.xpath(".//*[@id='pWdgPan_login']/div[1]/div[1]/a[1]/span[2]")).click();
			String handle=dr.getWindowHandle();
			Set<String> handles=dr.getWindowHandles();
			for(String hnd: handles)
			{
				if(!hnd.equals(handle))
				{
					dr.switchTo().window(hnd);

	dr.findElement(By.xpath(".//*[@id='email']")).clear();
	dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("rronit899@gmail.com");
	dr.findElement(By.xpath(".//*[@id='pass']")).clear();
	dr.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Test@123");
	dr.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	dr.findElement(By.xpath("//button[@type='submit' and @name='__CONFIRM__']")).click();
				}
			}


	}

}
