package com.mind;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popuphandlings {

	static String URL="https://www.naukri.com/";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.geckodriver.driver", "D://geckodriver.exe");
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
				dr.quit();
			}

			}
		
		


