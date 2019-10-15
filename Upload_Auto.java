package com.mind;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload_Auto {

	
	static String URL="https://www.naukri.com/";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver dr=new FirefoxDriver();
dr.manage().window().maximize() ;
dr.navigate().to(URL);
dr.findElement(By.xpath(".//*[@id='login_Layer']")).click();
dr.findElement(By.xpath(".//*[@id='lgnFrm']/div[9]/a")).click();
dr.findElement(By.xpath("html/body/div[1]/form/div[2]/div/button")).click();
dr.findElement(By.xpath(".//*[@id='fname']")).sendKeys("Ronit Roy");
dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("asd29aassddf@gmail.com");
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/div[3]/div[1]/div/input")).sendKeys("Test@123");
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/div[4]/div[1]/div/input[2]")).sendKeys("9952556568");
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[1]/div[1]/ul/li/div/label/input")).sendKeys("5");
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[1]/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[1]/div[1]/ul/li/div/label/input")).sendKeys(Keys.ENTER);
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input")).sendKeys("3");
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input")).sendKeys(Keys.DOWN);
dr.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input")).sendKeys(Keys.ENTER);

dr.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-uploader/div/div[1]/span[1]/input")).click();
Runtime.getRuntime().exec("C:\\Users\\Rahul\\Desktop\\Test_Autoitcode.exe");

	}

}
