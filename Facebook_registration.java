package com.mind;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_registration {
	static String URL="https://www.facebook.com/";

	public static void main(String[] args) throws IOException {
		WebDriver dr=new FirefoxDriver();
		//dr.get("https://facebook.com/");
		dr.navigate().to(URL);
		String title=dr.getTitle();
		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("user.dir"+"src//snaps//pic.jpeg"));
		//FileUtils.copyFile(src,new File("‪C:\\Users\\Rahul\\Desktop\\Snap\\pic.png"));
		dr.findElement(By.linkText("Create a Page")).click();
		String Altr=dr.getTitle();
		dr.navigate().back();
		if(title.equalsIgnoreCase(Altr))
		{
			System.out.println("Both page title not match");
		}
		
		dr.close();
		//dr.findElement(By.xpath(".//*[@id='u_0_4']")).sendKeys("Rahul");
		/*dr.findElement(By.id("u_0_4")).sendKeys("Rahul");
		dr.findElement(By.xpath(".//*[@id='u_0_6']")).sendKeys("Anshuman");
		dr.findElement(By.xpath(".//*[@id='u_0_9']")).sendKeys("a@gmail.com");
		dr.findElement(By.xpath(".//*[@id='u_0_c']")).sendKeys("a@gmail.com");
		dr.findElement(By.xpath(".//*[@id='u_0_g']")).sendKeys("Test@123");
		dr.findElement(By.xpath(".//*[@id='day']")).sendKeys("13");
		dr.findElement(By.xpath(".//*[@id='month']")).sendKeys("Sept");
		dr.findElement(By.xpath(".//*[@id='year']")).sendKeys("1989");
		dr.findElement(By.xpath(".//*[@id='birthday-help']")).click();
		dr.findElement(By.xpath(".//*[@id='js_41j']/div/div/div/div[2]/a")).click();
		
		dr.findElement(By.xpath(".//*[@id='u_0_2']")).click();*/
		//dr.findElement(By.xpath(".//*[@id='u_0_m']")).click();
		
		
		
		
		
	}

}
